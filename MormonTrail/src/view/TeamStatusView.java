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
public class TeamStatusView {
    
    //this view has the following save report to a file, quite or retun to the previous menue
    
    
    public void displayTeamStatusView() {
        Boolean endOfView = false;
        System.out.println("some day soon the team status will be here");
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
        System.out.println(
                  "R - report to a file\n"
                + "Q - Quit\n");
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (valid == false) {
            System.out.println("Choice: ");
            String sentence = scanner.nextLine();
            sentence = sentence.trim();
            if (sentence.length() < 1) {
                System.out.println("\"You must specify a value\"");
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
        if (menuItem.equals("R")){
            saveReport();
        }
        else if (menuItem.equals("Q")){
            return true;
        }
        else {
            System.out.println("invaled input");
        }
        return false;
    }
        
    private void saveReport() {
        System.out.println("Save report");
    }
}
