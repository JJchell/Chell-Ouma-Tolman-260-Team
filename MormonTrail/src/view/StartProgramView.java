/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author scott
 */
public class StartProgramView {
    public StartProgramView(){
    }
    
    /*displayStartProgramView() {
        endOfView = false
        DO
            inputs = getInputs()
            IF no inputs were entered OR the first input is Q
                RETURN
            ENDIF
            endOfView = doAction(inputs)"stub
        WHILE endOfView != true
    }*/
    
    public void displayStartProgramView() {
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
        
        System.out.println("Welcome to Mormon Trail.");
        
        Scanner scanner = new Scanner(System.in);
              
        
        boolean valid = false;
        while (valid == false) {
            System.out.println("Name: ");
            String sentence = scanner.nextLine();
            sentence = sentence.trim();
            if (sentence.length() < 1) {
                System.out.println("\"You must enter a non-blank value\"");
                continue;
            }
            inputs[0] = sentence; 
            valid = true;         
        }
            
        return inputs; 

    }

    private Boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs [0]);
        
        return true;
    }
}
