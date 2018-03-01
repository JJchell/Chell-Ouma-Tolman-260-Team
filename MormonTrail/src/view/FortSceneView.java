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
public class FortSceneView {
    
    public FortSceneView(){}
    
    public void displayFortSceneView() {
        boolean endOfView = false;
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
        System.out.println("Welcome to the Fort. Choose one of the following:"
                + "DP - Dance party.\n"
                + "GA - Get advice.\n"
                + "Q - Quit\n");
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (valid == false) {
            System.out.println("Choice: ");
            String sentence = scanner.nextLine();
            sentence = sentence.trim();
            if (sentence.length() < 1) {
                System.out.println("\"You must specify what you'd like to do.\"");
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