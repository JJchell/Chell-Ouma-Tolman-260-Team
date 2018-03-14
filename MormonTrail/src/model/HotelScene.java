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
public class HotelScene extends Scene  implements Serializable{
    
    private ArrayList<Characters> characters;
    
    public HotelScene(String Description) {
        super(Description);
    }

    public HotelScene(ArrayList<Characters> characters, String Description) {
        super(Description);
        this.characters = characters;
    }

    public ArrayList<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Characters> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.characters);
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
        final HotelScene other = (HotelScene) obj;
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "characters=" + characters + '}';
    }
    
}
