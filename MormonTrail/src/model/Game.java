/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author TheChells
 */
public class Game implements Serializable {
    
    private Player player;
    private int daysOnTrail;
    private Pace pace;
    private Rations rations;
    private Weather weather;
    private int milesTraveled;
    private int currentMoneyBalance;
    private Characters mainCharacter;
    private ArrayList<Characters> characters;
    private ArrayList<Inventory> inventory;
    private Map map;
    private Map visited;
    private Map toVisit;

    
    public Game() {
    }

    public Game(Player player, int daysOnTrail, Pace pace, Rations rations, Weather weather, int milesTraveled, int currentMoneyBalance, Characters mainCharacter, ArrayList<Characters> characters, ArrayList<Inventory> inventory, Map map, Map visited, Map toVisit) {
        this.player = player;
        this.daysOnTrail = daysOnTrail;
        this.pace = pace;
        this.rations = rations;
        this.weather = weather;
        this.milesTraveled = milesTraveled;
        this.currentMoneyBalance = currentMoneyBalance;
        this.mainCharacter = mainCharacter;
        this.characters = characters;
        this.inventory = inventory;
        this.map = map;
        this.visited = visited;
        this.toVisit = toVisit;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    public Rations getRations() {
        return rations;
    }

    public void setRations(Rations rations) {
        this.rations = rations;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
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

    public Characters getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Characters mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public ArrayList<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Characters> characters) {
        this.characters = characters;
    }

    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getVisited() {
        return visited;
    }

    public void setVisited(Map visited) {
        this.visited = visited;
    }

    public Map getToVisit() {
        return toVisit;
    }

    public void setToVisit(Map toVisit) {
        this.toVisit = toVisit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.player);
        hash = 89 * hash + this.daysOnTrail;
        hash = 89 * hash + Objects.hashCode(this.pace);
        hash = 89 * hash + Objects.hashCode(this.rations);
        hash = 89 * hash + Objects.hashCode(this.weather);
        hash = 89 * hash + this.milesTraveled;
        hash = 89 * hash + this.currentMoneyBalance;
        hash = 89 * hash + Objects.hashCode(this.mainCharacter);
        hash = 89 * hash + Objects.hashCode(this.characters);
        hash = 89 * hash + Objects.hashCode(this.inventory);
        hash = 89 * hash + Objects.hashCode(this.map);
        hash = 89 * hash + Objects.hashCode(this.visited);
        hash = 89 * hash + Objects.hashCode(this.toVisit);
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
        final Game other = (Game) obj;
        if (this.daysOnTrail != other.daysOnTrail) {
            return false;
        }
        if (this.milesTraveled != other.milesTraveled) {
            return false;
        }
        if (this.currentMoneyBalance != other.currentMoneyBalance) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (this.pace != other.pace) {
            return false;
        }
        if (this.rations != other.rations) {
            return false;
        }
        if (this.weather != other.weather) {
            return false;
        }
        if (!Objects.equals(this.mainCharacter, other.mainCharacter)) {
            return false;
        }
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.toVisit, other.toVisit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", daysOnTrail=" + daysOnTrail + ", pace=" + pace + ", rations=" + rations + ", weather=" + weather + ", milesTraveled=" + milesTraveled + ", currentMoneyBalance=" + currentMoneyBalance + ", mainCharacter=" + mainCharacter + ", characters=" + characters + ", inventory=" + inventory + ", map=" + map + ", visited=" + visited + ", toVisit=" + toVisit + '}';
    }
    
    
    
}
