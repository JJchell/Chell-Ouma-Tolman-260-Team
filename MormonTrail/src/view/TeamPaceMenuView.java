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
public class TeamPaceMenuView extends View{
    
    public TeamPaceMenuView(){
        super("Select Team Pace:"
                + "\nS - Slow"
                + "\nA - Average"
                + "\nF - Fast"
                + "\nQ - Return to previous menu\n");
    }
    
    @Override    
    public boolean doAction(String inputs) {
        String menuItem = inputs;
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

