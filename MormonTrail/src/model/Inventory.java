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
public class Inventory implements Serializable{
    
    InventoryItemType item;
    int currentWeight;
    int currentStrength;
    int maxWeight;

    public Inventory() {
    }    

    public Inventory(InventoryItemType item, int currentWeight, int currentStrength) {
        this.item = item;
        this.currentWeight = currentWeight;
        this.currentStrength = currentStrength;
    }

    public InventoryItemType getItem() {
        return item;
    }

    public int getCurrentyWeight() {
        return currentWeight;
    }

    public int getCurrentStrength() {
        return currentStrength;
    }

    public void setItem(InventoryItemType item) {
        this.item = item;
    }

    public void setCurrentyWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setCurrentStrength(int currentStrength) {
        this.currentStrength = currentStrength;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.item);
        hash = 61 * hash + this.currentWeight;
        hash = 61 * hash + this.currentStrength;
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
        final Inventory other = (Inventory) obj;
        if (this.currentWeight != other.currentWeight) {
            return false;
        }
        if (this.currentStrength != other.currentStrength) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", currentWeight=" + currentWeight + ", currentStrength=" + currentStrength + '}';
    }
}
