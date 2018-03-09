/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Game;
import mormontrail.MormonTrail;

/**
 *
 * @author Ouma
 */
public class MainMenuView extends View {
  
    public MainMenuView(){
        super("Main Menu"
                + "\nPlease choose from one of the following options:" 
                + "\nN - Start new game" 
                + "\nR - Restart game" 
                + "\nH - Help" 
                + "\nP - Change pace" 
                + "\nC - River Crossing"
                + "\nE - Return to previous menu");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "N": startNewGame();
                break;
            case "R": restartGame();
                break;
            case "H": getHelp();
                break;
            case "P": setPace(); //delete after testing
                break;
            case "C": riverCrossing(); //delete after testing
                break;
            case "E": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(MormonTrail.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    private void setPace() {
        TeamPaceMenuView teamPaceMenuView = new TeamPaceMenuView();
        teamPaceMenuView.display();
    }
    
    private void riverCrossing() {
        RiverCrossingSceneMenuView riverCrossingSceneMenuView = new RiverCrossingSceneMenuView();
        riverCrossingSceneMenuView.display();
    }
}
