/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import control.InventoryControl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Inventory;
import model.InventoryItemType;
import model.Location;
import model.Map;
import mormontrail.MormonTrail;

/**
 *
 * @author scott
 */
public class GameMenuView extends View{
    
    public GameMenuView() {
        super(
                  "T - What is the status of the team?\n"
                + "S - What supplies do you have?\n"
                + "P - What is our pace?\n"
                + "M - View the map\n"
                + "H - Help menu\n"
                + "G - Save the game\n"
                + "I - Print inventory report\n"
                + "Q - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "T": viewTeamStatus();
                break;
            case "S": viewTeamSupplies();
                break;
            case "P": setTeamPace();
                break;
            case "M": viewGameMap();
                break;
            case "H": displayHelpMenu();
                break;
            case "G": saveGame();
                break;
            case "I": printInventory();
                break;
            case "Q": return true;
            default: this.console.println("Invalid menu item");
        }
        return false;
    }
    
    private void viewTeamStatus() {
        TeamStatusView view = new TeamStatusView();
        view.display();
    }

    private void viewTeamSupplies() {
        InventoryControl.inventoryStatus();
    }

    private void setTeamPace() {
        TeamPaceMenuView view =new TeamPaceMenuView();
        view.display();
    }

    private void viewGameMap() {
        Map map = MormonTrail.getCurrentGame().getMap();
        ArrayList<Location> locations = map.getLocations();
        Location current = map.getCurrentLocation();
        boolean marker = false;
        for (int i = 0; i < locations.size(); i++) {
            if (marker == false) {
                //check if current should be printed
                if (locations.get(i).getMilepost() < current.getMilepost()) {
                    this.console.println(locations.get(i).getName() + " -- Type: " + 
                        locations.get(i).getType() + " -- Mile marker: " + 
                        locations.get(i).getMilepost());
                }
                else {
                    // print current location before ArrayList location
                    this.console.println("Current location: Mile marker " + 
                            current.getMilepost());
                    // calc distance
                    int distance = locations.get(i).getMilepost() - current.getMilepost();
                    // print ArrayList location
                    this.console.println(locations.get(i).getName() + " -- Type: " + 
                        locations.get(i).getType() + " -- Mile marker: " + 
                        locations.get(i).getMilepost() + " -- Distance to location: " + 
                        distance + " miles");
                    // stop checking if current location should be printed
                    marker = true;
                }
            }
            else {
                //print next ArrayList location
                    int distance = locations.get(i).getMilepost() - current.getMilepost();
                    this.console.println(locations.get(i).getName() + " -- Type: " + 
                        locations.get(i).getType() + " -- Mile marker: " + 
                        locations.get(i).getMilepost() + " -- Distance to location: " + 
                        distance + " miles");
            }
        }
    }

    private void displayHelpMenu() {
        HelpMenuView view = new HelpMenuView();
        view.display();
    }

    private void saveGame() {
        SaveGameView view = new SaveGameView();
        view.display();
    }

    private void printInventory() {
        this.console.println("Please enter a file name where you want your inventory report printed");
        try {
            String path = this.keyboard.readLine();
            printInventoryReport(path);
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
    
    private void printInventoryReport(String path) {
        try (PrintWriter logFile = new PrintWriter(path)) {
            logFile.println("\n\n            Inventory Report           ");
            logFile.printf("%n%-20s%10s%10s%10s", "Type", "Quantity", "Weight*", "Value");
            logFile.printf("%n%-20s%10s%10s%10s", "-----", "---------", "-------", "------");
            ArrayList<Inventory> inventory = MormonTrail.getCurrentGame().getInventory();
            for (int i = 0; i < inventory.size(); i++) {
                String type = inventory.get(i).getItem().toString();
                int quantity = inventory.get(i).getQuantity();
                int weight = inventory.get(i).getWeight();
                int value = inventory.get(i).getValue();
                logFile.printf("%n%-20s%10d%10d%10d", type, quantity, weight, value);
            }
            logFile.println("\n\n* A negative value denotes carrying capacity");
            this.console.println("Inventory report printed successfully");
        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
    
}
