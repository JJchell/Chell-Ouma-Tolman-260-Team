/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Characters;
import model.Game;
import model.Inventory;
import model.InventoryItemType;
import model.Location;
import model.Map;
import model.Pace;
import model.Player;
import model.Rations;
import model.Weather;
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
    
    public static void createNewGame(Player player) 
        throws GameControlException{
        
        if (MormonTrail.getPlayer() == null) {
            throw new GameControlException("ERROR: No Player initialized");
        }
        Game game = new Game();
        Player playa = MormonTrail.getPlayer();
        game.setPlayer(playa);
        MormonTrail.setCurrentGame(game);
        game.setPace(Pace.AVERAGE);
        game.setWeather(Weather.GOOD);
        game.setRations(Rations.NORMAL);
        ArrayList<Characters> characters = createCharacters(playa, game);
        game.setCharacters(characters);
        ArrayList<Inventory> inventory = createInventory();
        game.setInventory(inventory);
        Map map = createMap();
        game.setVisited(new Map());
        game.setToVisit(createMap());
        
        if (map == null) {
            throw new GameControlException("ERROR: No Map initialized");
        }
        
        game.setMap(map);
    }
    
    private static ArrayList<Characters> createCharacters(Player player, Game game) {
        ArrayList<Characters> characters = new ArrayList<>();
        Characters mainChar = new Characters(player.toString(), 2000, 5, 5, 1, 100);
        game.setMainCharacter(mainChar);
        characters.add(mainChar);
        characters.add(new Characters("James", 0, 10, 2, 8, 100));
        characters.add(new Characters("Shelly", 0, 2, 7, 5, 100));
        characters.add(new Characters("Scott", 0, 6, 7, 8, 100));
        return characters;
    }

    private static ArrayList<Inventory> createInventory() {
        ArrayList<Inventory> inventory = new ArrayList<>();
        inventory.add(new Inventory(InventoryItemType.Ox, 1, -1300, 200));
        inventory.add(new Inventory(InventoryItemType.Wagon, 1, 300, 250));
        inventory.add(new Inventory(InventoryItemType.SpareWheel, 3, 75, 30));
        inventory.add(new Inventory(InventoryItemType.Food, 300, 300, 150));
        inventory.add(new Inventory(InventoryItemType.Ammunition, 1000, 250, 125));
        return inventory;
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
        map.setCurrentLocation(locations.get(0));
        return map;
    } 
    
    public static void saveGame(Game game, String filePath) throws GameControlException, IOException{
        if (game == null)
            throw new GameControlException("Game is null");
        if (filePath.length() < 1)
            throw new GameControlException("File Path is invalid");
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(game);
        }   
    }
    
    public static Game getGame(String path) throws GameControlException, IOException, ClassNotFoundException{
        if (path == null)
            throw new GameControlException("File name doesn't exist");
        Game game;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            game = (Game) in.readObject();
            MormonTrail.setCurrentGame(game);
            MormonTrail.setPlayer(game.getPlayer());
        }
        return game;
    }
}