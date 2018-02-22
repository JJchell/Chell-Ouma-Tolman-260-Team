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
import view.StartProgramView;

/**
 *
 * @author TheChells
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();        
    }
}
