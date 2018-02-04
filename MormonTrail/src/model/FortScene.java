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
public class FortScene extends Scene  implements Serializable{
    
    private String fortName;
    
    
    public FortScene(String Description) {
        super(Description);
    }

    public FortScene(String fortName, String Description) {
        super(Description);
        this.fortName = fortName;
    }

    public String getFortName() {
        return fortName;
    }

    public void setFortName(String fortName) {
        this.fortName = fortName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.fortName);
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
        final FortScene other = (FortScene) obj;
        if (!Objects.equals(this.fortName, other.fortName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FortScene{" + "fortName=" + fortName + '}';
    }
    
}
