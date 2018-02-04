/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import  model.Character;
import model.Event;
import model.Map;

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
        //map.setLocation(new Location(LocationType.TOWN, "TheMilePost"));
        
        Event event1 = new Event();
        event1.setDescription("You've been bitten by a snake.");
        
        Event event2 = new Event();
        event2.setDescription("You have the flu.");
        
        Event event3 = new Event();
        event3.setDescription("You fell and scraped your knee.");
        
        Event event4 = new Event();
        event4.setDescription("You are hungry.");
        
        
        
        
        
        
        
        System.out.println("Name = " + jamesName + "\nMoney = " + jamesMoney 
                + "\nHunting skill = " + jamesHunting + "\nGather skill = " 
                + jamesGathering + "\nStamina = " + jamesStamina 
                + "\nHealth = " + jamesHealth);
    }
}
