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
public class MainMenuView {
    
    public MainMenuView(){}
    
    public void displayMainMenuView() {
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
        System.out.println("Main Menu"
                + "\nPlease choose from one of the following options:"
                + "\nN - Start new game"
                + "\nR - Restart game"
                + "\nH - Help"
                + "\nP - Change pace"
                + "\nR - River Crossing"
                + "\nE - Return to previous menu\n"); // remove change pace option after testing
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
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
    private void setPace() {
        TeamPaceMenuView teamPaceMenuView = new TeamPaceMenuView();
        teamPaceMenuView.displayTeamPaceMenuView();
    }
    
    private void riverCrossing() {
        RiverCrossingSceneMenuView riverCrossingSceneMenuView = new RiverCrossingSceneMenuView();
        riverCrossingSceneMenuView.displayRiverCrossingSceneMenuView();
    }
}
