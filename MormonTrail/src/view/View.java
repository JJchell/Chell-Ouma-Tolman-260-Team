/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author TheChells
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        Boolean endOfView = false;
        do {
            String inputs = getInput();
            String inp1 = inputs.toUpperCase();
            if (inputs == null || "Q".equals(inp1)) {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\n*** You must specify a value *** ");
                continue;
            }
            
            break;         
        }
        return value; 
    }
    
    @Override
    public abstract boolean doAction(String input);
}
