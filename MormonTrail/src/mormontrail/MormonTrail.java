/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import  model.Character;
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
        
        
        System.out.println("Name = " + jamesName + "\nMoney = " + jamesMoney 
                + "\nHunting skill = " + jamesHunting + "\nGather skill = " 
                + jamesGathering + "\nStamina = " + jamesStamina 
                + "\nHealth = " + jamesHealth);
    }
}
