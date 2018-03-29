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
            default: this.console.println("Invalid menu item");
        }
        return false;
    }

    private void displayGoalHelp() {
        this.console.println("displayGoalHelp() called");
    }

    private void displayMoveHelp() {
        this.console.println("displayMoveHelp() called");
    }

    private void displayResourceHelp() {
        this.console.println("displayResourceHelp() called");
    }

    private void displayHarvestHelp() {
        this.console.println("displayHarvestHelp() called");
    }

    private void displayDeliveryHelp() {
        this.console.println("displayDeliveryHelp() called");
    }

    private void displayRedBullHelp() {
        this.console.println("You now have wings!");
    }
    
}
