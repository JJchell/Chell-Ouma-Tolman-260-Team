/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author TheChells
 */
public class DisplayMapView extends View{
    
    public DisplayMapView() {
        super(
                  "G - Garden Grove (town)\n"
                + "M - Mount Pisgah (town)\n"
                + "K - Kanesville (town)\n"
                + "W - Winter Quarters (town)\n"
                + "FK - Fort Kearny (fort)\n"
                + "C - Chimney Rock (no town or fort)\n"
                + "FL - Fort Laramie (fort)\n"
                + "I - Independence Rock (no town or fort)\n"
                + "MC - Martin's Cove (no town or fort)\n"
                + "FB - Fort Bridger (fort)\n"
                + "S - Salt Lake Valley (fort)\n"
                + "H - Help menu\n"
                + "Q - Quit\n");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G": viewGardenGrove();
                break;
            case "M": viewMountPisgah();
                break;
            case "K": viewKanesville();
                break;
            case "W": viewWinterQuarters();
                break;
            case "FK": viewFortKearny();
                break;
            case "C": viewChimneyRock();
                break;
            case "FL": viewFortLaramie();
                break;
            case "I": viewIndependenceRock();
                break;
            case "MC": viewMartinsCove();
                break;
            case "FB": viewFortBridger();
                break;
            case "S": viewSaltLakeValley();
                break;
            case "H": displayHelpMenu();
                break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }
    
    private void viewGardenGrove() {
        System.out.println("View distance to Garden Grove");
    }

    private void viewMountPisgah() {
        System.out.println("View distance to Mount Pisgah");
    }

    private void viewKanesville() {
        System.out.println("View distance to Kanesville");
    }

    private void viewWinterQuarters() {
        System.out.println("view distance to Winter Quarters");
    }
    
    private void viewFortKearny() {
        System.out.println("View distance to Fort Kearny");
    }
    
    private void viewChimneyRock() {
        System.out.println("View distance to Chimney Rock");
    }
    
    private void viewFortLaramie() {
        System.out.println("View distance to Fort Laramie");
    }
    
    private void viewIndependenceRock() {
        System.out.println("View distance to Independence Rock");
    }
    
    private void viewMartinsCove() {
        System.out.println("View distance to Martin's Cove");
    }
    
    private void viewFortBridger() {
        System.out.println("View distance to Fort Bridger");
    }
    
    private void viewSaltLakeValley() {
        System.out.println("View distance to Salt Lake Valley");
    }

    private void displayHelpMenu() {
        HelpMenuView view = new HelpMenuView();
        view.display();
    }
    
}
