/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author TheChells
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();
    
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
        
        boolean valid = false;
        String value = null;
        
        try {
        while (!valid) {
            
            this.console.println("\n" + this.displayMessage);
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length() < 1) {
                this.console.println("\n*** You must specify a value *** ");
                continue;
            }
            
            break;         
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        
        return value;
    }
    
    @Override
    public abstract boolean doAction(String input);
}
