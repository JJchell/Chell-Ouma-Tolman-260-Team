/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import exceptions.GameControlException;
import java.io.IOException;
import model.Game;
import mormontrail.MormonTrail;

/**
 *
 * @author stolman
 */
public class SaveGameView extends View{
    
    @Override
    public String getInput() {
        this.console.println("Please enter the name of the file where you want "
                + "your game saved:");
        try {
            String input = this.keyboard.readLine();
            return input;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        return "err";
    }

    @Override
    public boolean doAction(String input) {
        Game game = MormonTrail.getCurrentGame();
        try{
            GameControl.saveGame(game, input);
        }
        catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        this.console.println("Game was successfully saved to " + input);
        return true;
    }
    
    
    
}
