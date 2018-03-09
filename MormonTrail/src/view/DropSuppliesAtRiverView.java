/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.InventoryItemType;

/**
 *
 * @author scott
 */
public class DropSuppliesAtRiverView extends View{

    public DropSuppliesAtRiverView(){
        super("This will show the current inventory"
                + "\nThe following is a placeholder example"
                + "\nOx\t1"
                + "\nWagon\t1"
                + "\nFood\t300"
                + "\nEnter the item you want to drop:");
    }
    
    @Override    
    public boolean doAction(String inputs) {
        String item = inputs;
        boolean match = false;
        InventoryItemType[] inv = InventoryItemType.values();
        for (int i = 0; i < inv.length; i++) {
            String invName = inv[i].toString();
            if (item.equals(invName))
                match = true;
        }
        if (match){
            int qnt = getQntInput();
            modifyInventory(item, qnt);
            return true;
        }
        else
            System.out.println("Invalid entry");
        return false;
    }
    
    private int getQntInput() {
        System.out.print("Enter the quantity you would like to drop: ");
        Scanner scan = new Scanner(System.in);
        int qnt = scan.nextInt();
        return qnt;
    }
    
    private void modifyInventory(String item, int qnt) {
        System.out.println("modifyInventory() has been called to remove " + qnt +""
        + " " + item);
    }
    
}
