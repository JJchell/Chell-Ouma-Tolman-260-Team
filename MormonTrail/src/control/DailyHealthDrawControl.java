/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.DailyHealthDrawControlException;
import java.util.ArrayList;
import model.Characters;
import model.Game;
import model.Pace;
import model.Rations;
import model.Weather;
import mormontrail.MormonTrail;

/**
 *
 * @author stolman
 */
public class DailyHealthDrawControl {
    
    
    public static void wearAndTear() throws DailyHealthDrawControlException {
        
        Game game = MormonTrail.getCurrentGame();
        ArrayList<Characters> characters = game.getCharacters();
        for (int i = 0; i < characters.size(); i++) {
            Characters c = characters.get(i);
            calcDailyHealthDraw(c.getCurrentHealth(), c.getDailyStaminaDraw(), game.getRations(), game.getWeather(), game.getPace());
        }
    }
    
    private static float calcDailyHealthDraw (float health, float stamina, Rations ration, Weather weather, Pace pace) 
        throws DailyHealthDrawControlException {

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
            throw new DailyHealthDrawControlException("Error: Stamina is out of range");
        if (draw >= stamina)
            draw -= stamina;
        else
            draw = 0;

        // current health's effect on draw
        if (health <= 0 || health > 100)
            throw new DailyHealthDrawControlException("Error: health is out of range");
        draw *= ((health / 100) + 1);

        return draw;
    }
    
}
