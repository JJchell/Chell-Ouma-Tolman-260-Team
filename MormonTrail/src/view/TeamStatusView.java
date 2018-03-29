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
public class TeamStatusView extends View{
    
    //this view has the following save report to a file, quite or retun to the previous menue
    
    
    public TeamStatusView() {
        super("R - report to a file\n"
                + "Q - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        if (menuItem.equals("R")){
            saveReport();
        }
        else if (menuItem.equals("Q")){
            return true;
        }
        else {
            this.console.println("invaled input");
        }
        return false;
    }
        
    private void saveReport() {
        this.console.println("Save report");
    }
}
