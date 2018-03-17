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
        
        ArrayList<Inventory> inventory = MormonTrail.getCurrentGame().getInventory();
        inventory.add(new Inventory(InventoryItemType.Food, 100, 100, 25)); // test value delete after testing
        inventory.add(new Inventory(InventoryItemType.Food, 200, 200, 50)); // test value delete after testing
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
}
