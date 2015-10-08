/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Item implements Serializable {
    
    public static final int MAX_HITPOINTS = 10;
    
    private String name;
    private int hitPoints;

    public Item() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    
    public boolean isHealthKit() {
        if(this instanceof HealthKit) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isWeapon() {
        return this instanceof Weapon;
    }
    
}
