/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author TheChells
 */
public class Game implements Serializable {
    
    private int daysOnTrail;
    private Pace pace;
    private int milesTraveled;
    private int currentMoneyBalance;

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
