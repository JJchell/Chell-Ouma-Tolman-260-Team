/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Ouma
 */
public class FortSceneView extends View{
    
    public FortSceneView(){
        super("Welcome to the Fort. Choose one of the following:"
                + "DP - Dance party.\n"
                + "GA - Get advice.\n"
                + "Q - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "DP": displayDanceParty();
                break;
            case "GA": displayGetAdvice();
                break;
            case "Q": return true;
            default: System.out.println("You must specify what you'd like to do.");
        }
        return false;
    }

    private void displayDanceParty() {
        System.out.println("Throw your hands up in the air like you just don't care! Everyone is dancing and you should too!");
    }

    private void displayGetAdvice() {
        System.out.println("Shelly offers you this advice: TRY your best not to break a nail while dancing. It really hurts.");
    }

  
    
}