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
    
//    public DropSuppliesAtRiverView(){}
//    
//    public void displayDropSuppliesAtRiverView() {
//        Boolean endOfView = false;
//        do {
//            String[] inputs = getInputs();
//            String inp1 = inputs[0].toUpperCase();
//            if (inputs == null || "Q".equals(inp1)) {
//                return;
//            }
//            endOfView = doAction(inputs);
//        } while (endOfView != true);
//    }
//    
//    private String[] getInputs() {
//        String[] inputs = new String[2];
//        System.out.println("This will show the current inventory"
//                + "\nThe following is a placeholder example"
//                + "\nOx\t1"
//                + "\nWagon\t1"
//                + "\nFood\t300"
//                + "\nEnter the item you want to drop followed by the quantity:");
//        Scanner scanner = new Scanner(System.in);
//        boolean valid = false;
//        while (valid == false) {
//            String sentence = scanner.nextLine();
//            if (sentence.length() < 1) {
//                System.out.println("\"You must specify an item as well as a quantity\"");
//                continue;
//            }
//            inputs = sentence.split(" ");
//            inputs[0] = inputs[0].trim();
//            inputs[1] = inputs[1].trim();
//            valid = true;         
//        }
//        return inputs; 
//    }
//    
//    private Boolean doAction(String[] inputs) {
//        String item = inputs[0];
//        int qnt = Integer.parseInt(inputs[1]);
//        boolean match = false;
//        InventoryItemType[] inv = InventoryItemType.values();
//        for (int i = 0; i < inv.length; i++) {
//            String invName = inv[i].toString();
//            if (item.equals(invName))
//                match = true;
//        }
//        if (match){
//            if (qnt > 0){
//                System.out.println("Item removed from inventory");
//                return true;
//            }
//        }
//        else
//            System.out.println("Invalid entry");
//        return false;
//    }
    
    /*****************************************************************/
    
    
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
            modifyInventory();
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
    
    private void modifyInventory() {
        System.out.println("modifyInventory() has been called");
    }
    
}
