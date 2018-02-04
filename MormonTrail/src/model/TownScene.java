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
 * @author scott
 */
public class TownScene extends FortScene  implements Serializable{
    
    private String townName;
    private ArrayList<Character> characters;
    
    
    public TownScene(String Description) {
        super(Description);
    }

    public TownScene(ArrayList<Character> characters, String Description) {
        super(Description);
        this.characters = characters;
    }

    public String getTownName() {
        return townName;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.townName);
        hash = 89 * hash + Objects.hashCode(this.characters);
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
        final TownScene other = (TownScene) obj;
        if (!Objects.equals(this.townName, other.townName)) {
            return false;
        }
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TownScene{" + "townName=" + townName + ", characters=" + characters + '}';
    }
    
    
    
}
