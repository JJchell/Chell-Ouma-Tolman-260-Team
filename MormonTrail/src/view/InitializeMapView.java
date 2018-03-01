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
public class InitializeMapView {
    
     public void displayInitializeMapView() {
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
        System.out.println("HS - Visit Hotel Scene\n"
                + "FS - Visit Fort Scene\n"
                + "GS - Visit General Store\n"
                + "TS - Visit Town Scene\n"
                + "RC - Visit River Crossing\n"
                + "DT - Visit Daily Trail Stop\n"
                + "Q - Quit\n");
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (valid == false) {
            System.out.println("Choice: ");
            String sentence = scanner.nextLine();
            sentence = sentence.trim();
            if (sentence.length() < 1) {
                System.out.println("\"You must specify where you'd like to visit\"");
                continue;
            }
            inputs[0] = sentence; 
            valid = true;         
        }
        return inputs; 
    }
    
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        choice = choice.toUpperCase();
        switch (choice) {
            case "HS": displayVisitHotelScene();
                break;
            case "FS": displayVisitFortScene();
                break;
            case "GS": displayVisitGeneralStore();
                break;
            case "TS": displayVisitTownScene();
                break;
            case "RC": displayVisitRiverCrossing();
                break;
            case "DT": displayDailyTrailStop();
                break;
            case "Q": return true;
            default: System.out.println("\n***Invalid selecation*** Try again");
        }
        return false;
    }

    private void displayVisitHotelScene() {
        System.out.println("displayHotelScene() called");
    }

    private void displayVisitFortScene() {
        System.out.println("displayFortScene() called");
    }

    private void displayVisitGeneralStore() {
        System.out.println("displayGeneralStore() called");
    }

    private void displayVisitTownScene() {
        System.out.println("displayTownScene() called");
    }

    private void displayVisitRiverCrossing() {
        System.out.println("displayVisitRiverCrossing() called");
    }

    private void displayDailyTrailStop() {
       System.out.println("displayDailyTrailStop() called");
    }

}