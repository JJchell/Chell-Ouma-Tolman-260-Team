/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.InventoryControl;
import java.util.ArrayList;
import java.util.Scanner;
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
    
}
