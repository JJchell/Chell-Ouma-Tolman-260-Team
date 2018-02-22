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
    
    /*getInputs(): String[] {

    inputs = new String array one element long
    Display a description of the view

    valid = false
    WHILE valid == false (no input value has been enterd)

    Display the prompt message - name 
    Get the value entered from the keyboard
    Trim off leading and trailing blanks from the value
    IF length of the value < 1 then
    Display "You must enter a non-blank value”
    Continue (move to the top of the loop and repeat)
    ENDIF
    Assign the value to the fist position in the inputs array
    valid = true (ends the loop)
    ENDWHILE

    RETURN inputs */

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
