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
            this.console.println("Invalid entry");
        return false;
    }
    
    private int getQntInput() {
            int qnt = 0;
        try{
            this.console.print("Enter the quantity you would like to drop: ");
            Scanner scan = new Scanner(this.keyboard.readLine());
            String inp = scan.nextLine();
            try {
                qnt = Integer.parseInt(inp);
            }
            catch(NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "Please enter a valid Integer.");
                
            }
        } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return qnt;
    }
    
    private void modifyInventory(String item, int qnt) {
        this.console.println("modifyInventory() has been called to remove " + qnt +""
        + " " + item);
    }
    
}
