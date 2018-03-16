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
 * @author TheChells
 */
public class Location implements Serializable{
    
    private String name;
    private String type;
    private int milepost;

    
    public Location() {
    
    }

    public Location(String name, String type, int milepost) {
        this.name = name;
        this.type = type;
        this.milepost = milepost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMilepost() {
        return milepost;
    }

    public void setMilepost(int milepost) {
        this.milepost = milepost;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + this.milepost;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "type=" + type + ", milepost=" + milepost + '}';
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
        final Location other = (Location) obj;
        if (this.milepost != other.milepost) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
   