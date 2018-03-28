/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DailyHealthDrawControl;
import exceptions.DailyHealthDrawControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stolman
 */
public class GamePlayMenuView extends View{
    
    public GamePlayMenuView() {
        // will call several getters to obtain correct data, and put that data
        // in the message
        super("Friday June 22"
                + "\nTraveled: 567 miles"
                + "\nDistance remaining: 933 miles"
                + "\nYou are on the Plains with plenty of wild game."
                + "\nSally's fever continues"
                + "\nToday's weather is Hot"
                + "\n\nChoose one of the following options:"
                + "\nC - Continue journey"
                + "\nS - View team status"
                + "\nU - View team supplies"
                + "\nP - Set team pace"
                + "\nG - Go hunting"
                + "\nM - View map"
                + "\nH - Help menu"
                + "\nQ - Main Menu");
    }
    
    @Override
    public boolean doAction(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "C": keepGoing();
            break;
            case "S": status();
            break;
            case "U": supplies();
            break;
            case "P": pace();
            break;
            case "G": interact();
            break;
            case "M": map();
            break;
            case "H": help();
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }
    
    private void keepGoing() {
        System.out.println("What is your favorite number?");
        String selection;
        try {
            selection = this.keyboard.readLine();
            String fav = this.keyboard.readLine();
            Double favNum = Double.parseDouble(fav);
            DailyHealthDrawControl.wearAndTear();
        }
        catch(DailyHealthDrawControlException ex) {
            System.out.println(ex.getMessage());
        }
        catch(NumberFormatException Nex) {
            System.out.println("Dude...That's not a number.");
        } catch (Exception ex) {
            System.out.println("Error reading input: " + ex.getMessage());
        }
        finally {
            System.out.println("Thanks for being an awesome gamer!");
        }
    }
    
    private void status() {
        System.out.println("status() called");
    }
    
    private void supplies() {
        System.out.println("supplies() called");
    }
    
    private void pace() {
        System.out.println("pace() called");
    }
    
    private void interact() {
        System.out.println("interact() called");
    }
    
    private void map() {
        System.out.println("map() called");
    }
    
    private void help() {
        System.out.println("help() called");
    }
    
}
