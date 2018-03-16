/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Characters;
import model.Game;
import model.Inventory;
import model.Location;
import model.Map;
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
        ArrayList<Characters> characters = createCharacters(playa, game);
//        Save the list of actors in the Game object
        game.setCharacters(characters);
//        Assign an actor to the player
//        items = createItems()
        ArrayList<Inventory> inventory = createInventory();
//        Save the list of items in the game
        game.setInventory(inventory);
//        map = createMap(noOfRows, noOfColumns, items)
        Map map = createMap();
        game.setVisited(new Map());
        game.setToVisit(createMap());
        
//        IF map == null THEN
//         RETURN -1
        if (map == null) {
            return -1;
        }
//        ENDIF
//        Assign the map to the game
        game.setMap(map);
        return 1; 
    }
    
    public static void initializeMap() {
        System.out.println("initializeMap() called");
    }
    
    private static ArrayList<Characters> createCharacters(Player player, Game game) {
        ArrayList<Characters> characters = new ArrayList<>();
        Characters mainChar = new Characters(player.toString(), 2000, 5, 5, 5, 100);
        game.setMainCharacter(mainChar);
        characters.add(mainChar);
        characters.add(new Characters("James", 0, 10, 2, 8, 100));
        characters.add(new Characters("Shelly", 0, 2, 7, 5, 100));
        characters.add(new Characters("Scott", 0, 6, 7, 8, 100));
        return characters;
    }

    private static ArrayList<Inventory> createInventory() {
        return new ArrayList<Inventory>();
    }

    private static Map createMap() {
        Map map = new Map();
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Nauvoo", "town", 0));
        locations.add(new Location("Garden Grove", "town", 128));
        locations.add(new Location("Mount Pisgah", "town", 153));
        locations.add(new Location("Kanesville", "town", 265));
        locations.add(new Location("Winter Quarters", "town", 266));
        locations.add(new Location("Platte River", "river", 305));
        locations.add(new Location("Fort Kearny", "fort", 469));
        locations.add(new Location("Chimney Rock", "no town or fort", 718));
        locations.add(new Location("Fort Laramie", "fort", 788));
        locations.add(new Location("Upper Platte River", "river", 914));
        locations.add(new Location("Independence Rock", "no town or fort", 965));
        locations.add(new Location("Martin's Cove", "no town or fort", 970));
        locations.add(new Location("Green River", "river", 1128));
        locations.add(new Location("Fort Bridger", "fort", 1183));
        locations.add(new Location("Bear River", "river", 1216));
        locations.add(new Location("Salt Lake Valley", "town", 1297));
        map.setLocations(locations);
        return map;
    }  
}