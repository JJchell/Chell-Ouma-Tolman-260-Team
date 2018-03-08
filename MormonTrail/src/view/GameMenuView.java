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
public class GameMenuView {
    
    public void displayGameMenuView() {
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
        System.out.println(
                  "T - What is the status of the team?\n"
                + "S - What supplies do you have?\n"
                + "P - What is our pace?\n"
                + "M - View the map\n"
                + "H - Help menu\n"
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
        view.displayTeamStatusView();
    }

    private void viewTeamSupplies() {
        System.out.println("view Supplies");
    }

    private void setTeamPace() {
        TeamPaceMenuView view =new TeamPaceMenuView();
        view.displayTeamPaceMenuView();
    }

    private void viewGameMap() {
        System.out.println("view map");
    }

    private void displayHelpMenu() {
        HelpMenuView view = new HelpMenuView();
        view.displayHelpMenuView();
    }
    
}
