/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author scott
 */
public class StartExistingGameView extends View{
    
    public void displayStartExistingGameView() {
        this.console.println("displayStartExistingGameView() called");
    }

    @Override
    public boolean doAction(String input) {
        this.console.println("displayStartExistingGameView() called");
        return true;
    }
    
}
