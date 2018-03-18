/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Inventory;
import model.InventoryItemType;
import mormontrail.MormonTrail;

/**
 *
 * @author scott
 */
public class InventoryControl {
    
    
    public static void inventoryStatus(){
        consolidateInventory(); // added by Scott Tolman 3.17.18
        ArrayList<Inventory> inventory = MormonTrail.getCurrentGame().getInventory();
        //inventory.add(new Inventory(InventoryItemType.Food, 100, 100, 25)); // test value delete after testing
        //inventory.add(new Inventory(InventoryItemType.Food, 200, 200, 50)); // test value delete after testing
        int totalCost = 0;
        int totalWeight = 0;
        int maxWeight = 0;
        
        for (int i = 0; i < inventory.size(); i++){
            totalCost += inventory.get(i).getValue();
            int weight = inventory.get(i).getWeight();
            if (weight >= 0){
                totalWeight += weight;
            }
            else {
                maxWeight += weight * -1;
            }
        }
        
        for (int i = 0; i < inventory.size(); i++){
            Inventory item = inventory.get(i);
            System.out.println(item.getItem().toString() + " -- Amount: " 
                    + item.getQuantity() + " -- Value $" + item.getValue() 
                    + " -- Weight " + item.getWeight());
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Total Value: $" + totalCost + " -- Total weight: " 
                + totalWeight + " -- Max Weight: " + maxWeight);
    }
    
    
    private static void consolidateInventory() {
        ArrayList<Inventory> inventory = MormonTrail.getCurrentGame().getInventory();
        ArrayList<Inventory> oxen = new ArrayList<>();
        ArrayList<Inventory> wagons = new ArrayList<>();
        ArrayList<Inventory> food = new ArrayList<>();
        ArrayList<Inventory> wheels = new ArrayList<>();
        ArrayList<Inventory> ammo = new ArrayList<>();
        
        for (int i = 0; i < inventory.size(); i++) {
            String type = inventory.get(i).getItem().toString();
            Inventory itm = inventory.get(i);
            switch (type) {
                case "Ox": oxen.add(itm);
                break;
                case "Wagon": wagons.add(itm);
                break;
                case "Food": food.add(itm);
                break;
                case "SpareWheel": wheels.add(itm);
                break;
                case "Ammunition": ammo.add(itm);
                break;
                default: System.out.println("*** Error: consolidateInventory() switch statement ***");
            }
        }
        consolidateItemType(oxen);
        consolidateItemType(wagons);
        consolidateItemType(food);
        consolidateItemType(wheels);
        consolidateItemType(ammo);
        
        inventory.clear();
        
        if (oxen.size() > 0) {
            inventory.add(oxen.get(0));
        }
        if (wagons.size() > 0) {
            inventory.add(wagons.get(0));
        }
        if (food.size() > 0) {
            inventory.add(food.get(0));
        }
        if (wheels.size() > 0) {
            inventory.add(wheels.get(0));
        }
        if (ammo.size() > 0) {
            inventory.add(ammo.get(0));
        }
    }
    
    private static void consolidateItemType(ArrayList<Inventory> list) {
        if (list.size() < 2) {
            return;
        }
        else {
            int quantity = 0;
            int weight = 0;
            int value = 0;
            for (int i = 0; i < list.size(); i++) {
                quantity += list.get(i).getQuantity();
                weight += list.get(i).getWeight();
                value += list.get(i).getValue();
            }
            Inventory item = new Inventory(list.get(0).getItem(), quantity, weight, value);
            list.clear();
            list.add(item);
        }
    }
}
