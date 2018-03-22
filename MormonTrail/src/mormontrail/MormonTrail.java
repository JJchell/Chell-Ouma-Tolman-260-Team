/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import java.util.ArrayList;
import model.Characters;
import model.InventoryItemType;
import model.Scene;
import model.RiverCrossingScene;
import model.DailyTrailStopScene;
import model.FortScene;
import model.TownScene;
import model.HotelScene;
import model.GeneralStoreScene;
import model.Inventory;
import model.Event;
import model.Game;
import model.Map;
import model.LocationType;
import model.Player;
import view.StartProgramView;
import view.InitializeMapView;
import view.FortSceneView;
import view.HuntingSceneView;


/**
 *
 * @author TheChells
 */
public class MormonTrail {

    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();            
        }
        catch(Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        MormonTrail.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        MormonTrail.player = player;
    }
}

