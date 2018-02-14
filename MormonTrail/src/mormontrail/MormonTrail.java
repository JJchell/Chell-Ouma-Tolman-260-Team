/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import java.util.ArrayList;
import model.Character;
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
import model.Map;
import model.LocationType;

/**
 *
 * @author TheChells
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character james = new Character();
        
        james.setName("James Chell");
        james.setMoney(200);
        james.setHuntingSkill(10);
        james.setGatheringSkill(2);
        james.setDailyStaminaDraw(5);
        james.setCurrentHealth(8);
        
        
        String jamesName = james.getName();
        int jamesMoney = james.getMoney();
        int jamesHunting = james.getHuntingSkill();
        int jamesGathering = james.getGatheringSkill();
        int jamesStamina = james.getDailyStaminaDraw();
        int jamesHealth = james.getCurrentHealth();
        
        
        Map map = new Map();
        map.setLocation(new Location(LocationType.town, "TheMilePost"));
        
        Event event1 = new Event();
        event1.setDescription("You've been bitten by a snake.");
        
        Event event2 = new Event();
        event2.setDescription("You have the flu.");
        
        Event event3 = new Event();
        event3.setDescription("You fell and scraped your knee.");
        
        Event event4 = new Event();
        event4.setDescription("You are hungry.");
        
        
        
        
        
        
        
        System.out.println(james.toString());
        
        Scene river = new RiverCrossingScene("This river looks treacherous!");
        System.out.println(river.toString());
        
        Scene stop = new DailyTrailStopScene("Look! There is a Buffalo!");
        System.out.println(stop.toString());
        
        Scene fort = new FortScene("Hopefully this will keep us safe from the Indians.");
        System.out.println(fort.toString());
        
        Scene town = new TownScene("Welcome Mormons!");
        System.out.println(town.toString());
        
        Scene hotel = new HotelScene("Now this is camping!");
        System.out.println(hotel.toString());
        
        Inventory inventory = new Inventory(InventoryItemType.Ox, 1300, 70);
        ArrayList<Inventory> items = new ArrayList<>();
        items.add(inventory);
        
        Scene store = new GeneralStoreScene(items, "Maybe they have a seniors' discount.");
        System.out.println(store.toString());
        
        
    }
}
