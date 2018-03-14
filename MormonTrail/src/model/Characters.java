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
public class Characters implements Serializable {
    
    private String name;
    private int money;
    private int huntingSkill;
    private int gatheringSkill;
    private int dailyStaminaDraw;
    private int currentHealth;

    public Characters() {
    } 
    
    public Characters(String name, int money, int huntingSkill, int gatheringSkill, int dailyStaminaDraw, int currentHealth) {
        this.name = name;
        this.money = money;
        this.huntingSkill = huntingSkill;
        this.gatheringSkill = gatheringSkill;
        this.dailyStaminaDraw = dailyStaminaDraw;
        this.currentHealth = currentHealth;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(int huntingSkill) {
        this.huntingSkill = huntingSkill;
    }

    public int getGatheringSkill() {
        return gatheringSkill;
    }

    public void setGatheringSkill(int gatheringSkill) {
        this.gatheringSkill = gatheringSkill;
    }

    public int getDailyStaminaDraw() {
        return dailyStaminaDraw;
    }

    public void setDailyStaminaDraw(int dailyStaminaDraw) {
        this.dailyStaminaDraw = dailyStaminaDraw;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.money;
        hash = 23 * hash + this.huntingSkill;
        hash = 23 * hash + this.gatheringSkill;
        hash = 23 * hash + this.dailyStaminaDraw;
        hash = 23 * hash + this.currentHealth;
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
        final Characters other = (Characters) obj;
        if (this.money != other.money) {
            return false;
        }
        if (this.huntingSkill != other.huntingSkill) {
            return false;
        }
        if (this.gatheringSkill != other.gatheringSkill) {
            return false;
        }
        if (this.dailyStaminaDraw != other.dailyStaminaDraw) {
            return false;
        }
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", money=" + money 
                + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" 
                + gatheringSkill + ", dailyStaminaDraw=" + dailyStaminaDraw 
                + ", currentHealth=" + currentHealth + '}';
    }
    
    
    
}

