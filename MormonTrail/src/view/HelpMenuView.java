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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
        super("G - What is the goal of the game?\n"
                + "M - How to move\n"
                + "E - Estimate the number of resources\n"
                + "H - Harvest resources\n"
                + "D - Delivering resources to warehouse\n"
                + "Q - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
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
