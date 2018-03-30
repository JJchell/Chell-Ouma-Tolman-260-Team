/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import exceptions.GameControlException;
import java.io.IOException;

/**
 *
 * @author scott
 */
public class StartExistingGameView extends View{
    
    public StartExistingGameView() {
        super("Please enter the file name of your saved game");
    }

    @Override
    public boolean doAction(String input) {
        try {
            GameControl.getGame(input);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        GameMenuView view = new GameMenuView();
        view.display();
        return true;
    }
    
}
