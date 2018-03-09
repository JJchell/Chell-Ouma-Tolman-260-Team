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
public class RiverCrossingSceneMenuView extends View{
    
    public RiverCrossingSceneMenuView(){
        super("Select Team Pace:"
                + "\nD - Drop supplies"
                + "\nC - Cross the river"
                + "\nB - Go back and think about it");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "D": dropSupplies();
                break;
            case "C": crossRiver();
                break;
            case "B": return true;
            default: System.out.println("Invalid option.");
        }
        return false;
    }

    private void dropSupplies() {
        DropSuppliesAtRiverView dropSuppliesAtRiverView = new DropSuppliesAtRiverView();
            dropSuppliesAtRiverView.display();
    }
    
    private void crossRiver() {
        System.out.println("crossRiver() called");
    }
    
}
    