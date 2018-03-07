/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Player;
import view.MainMenuView;

/**
 *
 * @author scott
 */
public class StartProgramView {
    public StartProgramView(){
    }
   
    
    /*displayStartProgramView() {
        endOfView = false
        DO
            inputs = getInputs()
            IF no inputs were entered OR the first input is Q
                RETURN
            ENDIF
            endOfView = doAction(inputs)"stub
        WHILE endOfView != true
    }*/
    
    public void display() {
        Boolean endOfView = false;
        do {
            String[] inputs = getInput();
            String inp1 = inputs[0].toUpperCase();
            if (inputs == null || "Q".equals(inp1)) {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }
    
    private String[] getInput() {
        String[] inputs = new String[1];
        
        System.out.println("Welcome to Mormon Trail.");
        
        Scanner scanner = new Scanner(System.in);
              
        
        boolean valid = false;
        while (valid == false) {
            System.out.println("Name: ");
            String sentence = scanner.nextLine();
            sentence = sentence.trim();
            if (sentence.length() < 1) {
                System.out.println("\"You must enter a non-blank value\"");
                continue;
            }
            inputs[0] = sentence; 
            valid = true;         
        }
            
        return inputs; 
    }

    /*doAction(inputs): boolean {
        playersName = get the first value in the inputs array
        player = savePlayer(playersName)
        IF player == null
         display “Could not create the player. “ +
         “Enter a different name.”
         RETURN false
        ENDIF
        DISPLAY "================================================= "
         + "Welcome to the game " + playersName
         + "We hope you have a lot of fun!”
         + "================================================= "
        mainMenuView = Create a new MainMenuView object
        mainMenuView.displayMainMenuView()
        RETURN true 
    } */

    private Boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = GameControl.savePlayer(playerName);
        if (player == null) {
            System.out.println("Could not create the player.\nEnter a different name.");  
            return false; 
        }
         System.out.print("================================================= "
         + "\nWelcome to the game " + playerName
         + "\nWe hope you have a lot of fun!"
         + "\n================================================= ");
        
         MainMenuView mainMenuView = new MainMenuView(); 
         mainMenuView.display();
        return true;
    }
}

