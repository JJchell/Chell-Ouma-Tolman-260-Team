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
    int quantity;
    int weight;
    int value;

    public Inventory() {
    }    

    public Inventory(InventoryItemType item, int quantity, int weight, int value) {
        this.item = item;
        this.quantity = quantity;
        this.weight = weight;
        this.value = value;
    }

    public InventoryItemType getItem() {
        return item;
    }

    public void setItem(InventoryItemType item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.item);
        hash = 47 * hash + this.quantity;
        hash = 47 * hash + this.weight;
        hash = 47 * hash + this.value;
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
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", quantity=" + quantity + ", weight=" + weight + ", value=" + value + '}';
    }

    

    
}
