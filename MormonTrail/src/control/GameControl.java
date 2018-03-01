/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Player;
import mormontrail.MormonTrail;

/**
 *
 * @author scott
 */
public class GameControl {
    
    public static Player savePlayer(String playerName) {
        if (playerName == null || playerName.length() < 1)
            return null;
        
        Player player = new Player(playerName);
        MormonTrail.setPlayer(player);
        return player;
    }
    
    public static void createNewGame(Player player) {
        System.out.println("createNewGame() called");
    }
    
    public static void initializeMap() {
        System.out.println("initializeMap() called");
    }
}



