/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.xml.stream.Location;//delete this after Location is implemented


/**
 *
 * @author Ouma
 */
public class Map implements Serializable {
    
    private Location currentLocation;

    public Map(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Map() {
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
