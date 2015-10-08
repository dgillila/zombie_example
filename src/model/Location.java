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
public class Location implements Serializable {
    
    private Zombie zombie;
    private Item item;
    private int row;
    private int col;
    private boolean exitLocation;

    public Location() {
        
    }
    
    public Zombie getZombie() {
        return zombie;
    }

    public void setZombie(Zombie zombie) {
        this.zombie = zombie;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isExitLocation() {
        return exitLocation;
    }

    public void setExitLocation(boolean exitLocation) {
        this.exitLocation = exitLocation;
    }
    
    public boolean hasItem() {
        return item != null;
    }
    
    public boolean hasZombie() {
        return zombie != null;
    }
    
}
