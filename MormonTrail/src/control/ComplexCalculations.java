/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Pace;
import model.Rations;
import model.Weather;

/**
 *
 * @author scott
 */
public class ComplexCalculations {
    public static int huntSuccess(int huntingSkill, int wildLife) {
        if (huntingSkill > 0 && huntingSkill < 11 && wildLife > 0 && wildLife < 11) {
            return huntingSkill * wildLife;
        }
        else
            return -1; // returning negative number as indication of invalid arguments
    }
    
    
    /**
     * calculating the chance of crossing a river successfully 
     * @param weightOfWagon
     * @param depthOfRiver
     * @param randomNumber
     * @param strenghtOfOxen
     * @return 
     */
    public static int calcRiverSuccess(int weightOfWagon, int depthOfRiver, 
            int randomNumber, int strenghtOfOxen) {
        if (weightOfWagon > 13 && weightOfWagon < 33 && depthOfRiver > 12 &&
                depthOfRiver < 48 && randomNumber > 1 && randomNumber < 25 &&
                strenghtOfOxen > 1 && strenghtOfOxen < 40) {
            return (weightOfWagon + depthOfRiver + randomNumber) - strenghtOfOxen;
        }
        else
            return -1; // returning negative number as indication of invalid arguments
    }
    
    public float calcDailyHealthDraw (float health, float stamina, Rations ration, Weather weather, Pace pace) {

    // basic health draw for normal pace, normal rations, and good weather
    float draw = 10;

    // pace's effect on health
    if (pace == Pace.SLOW)
        draw -= 5;
    else if (pace == Pace.FAST)
        draw += 5;

    // rations effect on draw
    if (ration == Rations.MEAGER)
        draw += 5;
    else if (ration == Rations.FEAST)
        draw -= 5;

    // weather's effect on draw
    if (weather == Weather.HOT || weather == Weather.COLD)
        draw += 5;

    // stamina's effect on draw
    if (stamina <1 || stamina > 10)
        return -1;
    if (draw >= stamina)
        draw -= stamina;
    else
        draw = 0;

    // current health's effect on draw
    if (health <= 0 || health > 100)
        return -1;
    draw *= ((health / 100) + 1);

    return draw;
}
     /**
     * This formula calculates how many days of rest based on current stamina
     * Stamina must be a positive number, greater than or equal to 0 and less than or equal to 10  
     * Output Number days rest needed based on current stamina 
     * @param stamina
     * @return 
     */
    
    public static int calcDayofRest (int stamina) {
        if (stamina >=0 && stamina <4)
            return 3;
        else if (stamina >= 4 && stamina <7)
            return 2;
        else if (stamina >= 7 && stamina <10)
            return 1;
        else if (stamina == 10)
            return 0;
        else
            return -1; // returning a negative number as indication of invalid arguments
    }

}
n
