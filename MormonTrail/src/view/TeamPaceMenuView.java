/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Game;
import model.Pace;
import mormontrail.MormonTrail;

/**
 *
 * @author scott
 */
public class TeamPaceMenuView {
    
    public TeamPaceMenuView(){}
    
    public void displayTeamPaceMenuView() {
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
                + "\nS - Slow"
                + "\nA - Average"
                + "\nF - Fast"
                + "\nQ - Return to previous menu\n");
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
            case "S": changePace("Slow");
                break;
            case "A": changePace("Average");
                break;
            case "F": changePace("Fast");
                break;
            case "Q": return true;
            default: System.out.println("Invalid pace option.");
        }
        return false;
    }

    private void changePace(String pace) {
        //Game game = MormonTrail.getCurrentGame();
        //game.setPace(pace);
        
        System.out.println("\n*** Pace set to " + pace + " ***\n");
    }
}

