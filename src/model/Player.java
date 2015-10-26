/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.BattleController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Player implements Serializable {
    
    public static final int MAX_DAMAGE = 9;
    
    private String name;
    private int hitPoints;
    private List<Item> items;
    
    public Player() {
        items = new ArrayList<Item>();
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public boolean hasFirstAidKit() {
        for(Item i : this.items) {
            if(i.getName().equals("First Aid Kit")) {
                return true;
            }
        }
        
        return false;
    }
    
}
