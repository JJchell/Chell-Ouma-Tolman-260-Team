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
public class InitializeMapView extends View{
    
     public InitializeMapView() {
        super(    "HS - Visit Hotel Scene\n"
                + "FS - Visit Fort Scene\n"
                + "GS - Visit General Store\n"
                + "TS - Visit Town Scene\n"
                + "RC - Visit River Crossing\n"
                + "DT - Visit Daily Trail Stop\n"
                + "Q - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String choice = inputs;
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
            default: this.console.println("\n***Invalid selecation*** Try again");
        }
        return false;
    }

    private void displayVisitHotelScene() {
        this.console.println("displayHotelScene() called");
    }

    private void displayVisitFortScene() {
        this.console.println("displayFortScene() called");
    }

    private void displayVisitGeneralStore() {
        this.console.println("displayGeneralStore() called");
    }

    private void displayVisitTownScene() {
        this.console.println("displayTownScene() called");
    }

    private void displayVisitRiverCrossing() {
        this.console.println("displayVisitRiverCrossing() called");
    }

    private void displayDailyTrailStop() {
       this.console.println("displayDailyTrailStop() called");
    }

}