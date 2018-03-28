/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MormonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
            MormonTrail.outFile = new PrintWriter(System.out, true);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();            
        }
        catch(Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
        finally {
            try {
                if (MormonTrail.inFile != null)
                    MormonTrail.inFile.close();
                if (MormonTrail.outFile != null)
                    MormonTrail.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MormonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MormonTrail.inFile = inFile;
    }
    
    
}

