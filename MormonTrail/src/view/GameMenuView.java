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
public class GameMenuView extends View{
    
    public GameMenuView() {
        super(
                  "T - What is the status of the team?\n"
                + "S - What supplies do you have?\n"
                + "P - What is our pace?\n"
                + "M - View the map\n"
                + "H - Help menu\n"
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
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }
    
    private void viewTeamStatus() {
        TeamStatusView view = new TeamStatusView();
        view.display();
    }

    private void viewTeamSupplies() {
        System.out.println("view Supplies");
    }

    private void setTeamPace() {
        TeamPaceMenuView view =new TeamPaceMenuView();
        view.display();
    }

    private void viewGameMap() {
        System.out.println("view map");
    }

    private void displayHelpMenu() {
        HelpMenuView view = new HelpMenuView();
        view.display();
    }
    
}
