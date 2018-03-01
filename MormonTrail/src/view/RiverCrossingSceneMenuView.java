/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author scott
 */
public class RiverCrossingSceneMenuView {
    
    public RiverCrossingSceneMenuView(){}
    
    public void displayRiverCrossingSceneMenuView() {
        Boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            String inp1 = inputs[0].toUpperCase();
            if (inputs == null || "Q".equals(inp1)) {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Select Team Pace:"
                + "\nD - Drop supplies"
                + "\nC - Cross the river"
                + "\nB - Go back and think about it");
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (valid == false) {
            System.out.println("Choice: ");
            String sentence = scanner.nextLine();
            sentence = sentence.trim();
            if (sentence.length() < 1) {
                System.out.println("\"You must specify a value\"");
                continue;
            }
            inputs[0] = sentence; 
            valid = true;         
        }
        return inputs; 
    }
    
    private Boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "D": dropSupplies();
                break;
            case "C": crossRiver();
                break;
            case "B": return true;
            default: System.out.println("Invalid option.");
        }
        return false;
    }

    private void dropSupplies() {
        DropSuppliesAtRiverView dropSuppliesAtRiverView = new DropSuppliesAtRiverView();
            dropSuppliesAtRiverView.displayDropSuppliesAtRiverView();
    }
    
    private void crossRiver() {
        System.out.println("crossRiver() called");
    }
    
}
    