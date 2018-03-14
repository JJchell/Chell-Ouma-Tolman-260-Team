/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Characters;
import model.Game;
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
    
    public static int createNewGame(Player player) {
//        if (player == null)
//        return -1
        if (MormonTrail.getPlayer() == null) {
            return -1;
        }
//        game = create a new Game object
        Game game = new Game();
//        Save a reference to the Player object in the game
        Player playa = MormonTrail.getPlayer();
        game.setPlayer(playa);
//        Save a reference to the game in the main class
        MormonTrail.setCurrentGame(game);
//        actors = createActors()
        ArrayList<Characters> characters = createCharacters(playa);
//        Save the list of actors in the Game object
//        Assign an actor to the player
//        items = createItems()
//        Save the list of items in the game
//        map = createMap(noOfRows, noOfColumns, items)
//        IF map == null THEN
//         RETURN -1
//        ENDIF
//        Assign the map to the game
        return 1; 
    }
    
    public static void initializeMap() {
        System.out.println("initializeMap() called");
    }
    
    private static ArrayList<Characters> createCharacters(Player player) {
        ArrayList<Characters> characters = new ArrayList<>();
        characters.add(new Characters(player.toString(), 500, 5, 5, 5, 100));
        characters.add(new Characters("James", 500, 10, 2, 8, 100));
        characters.add(new Characters("Shelly", 500, 2, 7, 5, 100));
        characters.add(new Characters("Scott", 500, 6, 7, 8, 100));
        return characters;
    }
}



