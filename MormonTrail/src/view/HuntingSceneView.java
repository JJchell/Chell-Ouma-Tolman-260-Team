/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ComplexCalculations;

/**
 *
 * @author Ouma
 */
public class HuntingSceneView extends View{
    
    public HuntingSceneView() {
       super("Welcome to the Hunting Scene! Are you ready to hunt?:"
               + "Y - Yes.\n"
               + "Q - Quit.\n");    
        }
    
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "Y":
                huntNow();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void huntNow() {
        this.console.println("huntSuccess() called");
    }    
}

