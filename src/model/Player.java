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
public class Player implements Serializable {
    
    private String name;
    private int hitPoints;
    
    public Player() {
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
    
    public void applyDamage(int damage) {
        this.hitPoints = this.hitPoints - damage;
        //this.hitPoints -= damage;
    }
    
}
