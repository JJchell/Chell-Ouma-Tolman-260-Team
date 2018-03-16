/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Ouma
 */
public class Map implements Serializable {
    
    private ArrayList<Location> locations;
    private Location currentLocation;

    

    public Map() {
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }
}
