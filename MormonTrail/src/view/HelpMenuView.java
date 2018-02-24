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
public class HelpMenuView {
    
    public void displayHelpMenuView() {
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
        System.out.println("G - What is the goal of the game?\n"
                + "M - How to move\n"
                + "E - Extimate the number of resources\n"
                + "H - Harvest resources\n"
                + "D - Delivering resources to warehouse\n"
                + "Q - Quit\n");
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
            case "G": displayGoalHelp();
                break;
            case "M": displayMoveHelp();
                break;
            case "E": displayResourceHelp();
                break;
            case "H": displayHarvestHelp();
                break;
            case "D": displayDeliveryHelp();
                break;
            case "RB": displayRedBullHelp();
                break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }

    private void displayGoalHelp() {
        System.out.println("displayGoalHelp() called");
    }

    private void displayMoveHelp() {
        System.out.println("displayMoveHelp() called");
    }

    private void displayResourceHelp() {
        System.out.println("displayResourceHelp() called");
    }

    private void displayHarvestHelp() {
        System.out.println("displayHarvestHelp() called");
    }

    private void displayDeliveryHelp() {
        System.out.println("displayDeliveryHelp() called");
    }

    private void displayRedBullHelp() {
        System.out.println("You now have wings!");
    }
    
}
