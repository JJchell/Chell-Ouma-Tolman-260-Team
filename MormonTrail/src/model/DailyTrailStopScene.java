/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author scott
 */
public class DailyTrailStopScene extends Scene  implements Serializable{
    
    private boolean hasNearbyTown;
    private String nearbyTownName;
    private boolean hasNearbyFort;
    private String nearbyFortName;
    
    
    public DailyTrailStopScene(String Description) {
        super(Description);
    }  

    public DailyTrailStopScene(boolean hasNearbyTown, String nearbyTownName, boolean hasNearbyFort, String nearbyFortName, String Description) {
        super(Description);
        this.hasNearbyTown = hasNearbyTown;
        this.nearbyTownName = nearbyTownName;
        this.hasNearbyFort = hasNearbyFort;
        this.nearbyFortName = nearbyFortName;
    }    

    public boolean isHasNearbyTown() {
        return hasNearbyTown;
    }

    public String getNearbyTownName() {
        return nearbyTownName;
    }

    public boolean isHasNearbyFort() {
        return hasNearbyFort;
    }

    public String getNearbyFortName() {
        return nearbyFortName;
    }

    public void setHasNearbyTown(boolean hasNearbyTown) {
        this.hasNearbyTown = hasNearbyTown;
    }

    public void setNearbyTownName(String nearbyTownName) {
        this.nearbyTownName = nearbyTownName;
    }

    public void setHasNearbyFort(boolean hasNearbyFort) {
        this.hasNearbyFort = hasNearbyFort;
    }

    public void setNearbyFortName(String nearbyFortName) {
        this.nearbyFortName = nearbyFortName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.hasNearbyTown ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.nearbyTownName);
        hash = 59 * hash + (this.hasNearbyFort ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.nearbyFortName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DailyTrailStopScene other = (DailyTrailStopScene) obj;
        if (this.hasNearbyTown != other.hasNearbyTown) {
            return false;
        }
        if (this.hasNearbyFort != other.hasNearbyFort) {
            return false;
        }
        if (!Objects.equals(this.nearbyTownName, other.nearbyTownName)) {
            return false;
        }
        if (!Objects.equals(this.nearbyFortName, other.nearbyFortName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DailyTrailStopScene{" + "hasNearbyTown=" + hasNearbyTown + ", nearbyTownName=" + nearbyTownName + ", hasNearbyFort=" + hasNearbyFort + ", nearbyFortName=" + nearbyFortName + '}';
    }

    
}
