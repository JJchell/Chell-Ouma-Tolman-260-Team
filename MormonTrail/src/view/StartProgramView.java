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
public class StartProgramView extends View{
    
    public StartProgramView(){
        super("Welcome to Mormon Trail."
                + "\nPlease enter your name:");
    }

    @Override
    public boolean doAction(String inputs) {
        String playerName = inputs;
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

