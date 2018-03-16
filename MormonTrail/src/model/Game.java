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
 * @author TheChells
 */
public class Game implements Serializable {
    
    private Player player;
    private int daysOnTrail;
    private Pace pace;
    private int milesTraveled;
    private int currentMoneyBalance;
    private Characters mainCharacter;
    private ArrayList<Characters> characters;
    private ArrayList<Inventory> inventory;
    private Map map;
    private Map visited;
    private Map toVisit;
    
    
    public Game() {}
    
    public ArrayList<Characters> getCharacters() {
        return characters;
    }
    
    public void setCharacters(ArrayList<Characters> characters) {
        this.characters = characters;
    }

    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setVisited(Map visited) {
        this.visited = visited;
    }

    public void setToVisit(Map toVisit) {
        this.toVisit = toVisit;
    }

    public Map getMap() {
        return map;
    }

    public Map getVisited() {
        return visited;
    }

    public Map getToVisit() {
        return toVisit;
    }

    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Characters getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Characters mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public int getDaysOnTrail() {
        return daysOnTrail;
    }

    public void setDaysOnTrail(int daysOnTrail) {
        this.daysOnTrail = daysOnTrail;
    }

    public Pace getPace() {
        return pace;
    }

    public void setPace(Pace pace) {
        this.pace = pace;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public int getCurrentMoneyBalance() {
        return currentMoneyBalance;
    }

    public void setCurrentMoneyBalance(int currentMoneyBalance) {
        this.currentMoneyBalance = currentMoneyBalance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.daysOnTrail;
        hash = 29 * hash + this.milesTraveled;
        hash = 29 * hash + this.currentMoneyBalance;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "daysOnTrail=" + daysOnTrail + ", pace=" + pace 
                + ", milesTraveled=" + milesTraveled + ", currentMoneyBalance=" 
                + currentMoneyBalance + '}';
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
        final Game other = (Game) obj;
        if (this.daysOnTrail != other.daysOnTrail) {
            return false;
        }
        if (this.pace != other.pace) {
            return false;
        }
        if (this.milesTraveled != other.milesTraveled) {
            return false;
        }
        if (this.currentMoneyBalance != other.currentMoneyBalance) {
            return false;
        }
        return true;
    }
    
    
    
}
