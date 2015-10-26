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
public class Map implements Serializable {
    
    public static final int NUM_ROWS = 9;
    public static final int NUM_COLS = 9;
    private Location[][] matrix;
    
    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }
    
    /////////////////////////////////////////////
    // METHODS
    /////////////////////////////////////////////
    
    public String toString() {
        String rtn = "";
        
        for(int row = 0; row < NUM_ROWS; row++) {
            for(int col = 0; col < NUM_COLS; col++) {
                if(matrix[row][col] == null) {
                    rtn += "x  ";
                }
                if(matrix[row][col].hasItem() && matrix[row][col].hasZombie()) {
                    rtn += "zi ";
                } else if (matrix[row][col].hasItem()) {
                    rtn += "i  ";
                } else if (matrix[row][col].hasZombie()) {
                    rtn += "z  ";
                } else {
                    rtn += "x  ";   
                }
            }
            rtn += "\n";
        }
        
        return rtn;
    }
    
    public void initialize() {
        
        Location castle = new Location();
        //Setup castle
        matrix[1][1] = castle;
        
        Location tower = new Location();
        //setup tower
        matrix[0][1] = tower;
        
        
        int numZombies = 30;
        int numItems = 15;
        
        for(int row = 0; row < NUM_ROWS; row++) {
            for(int col = 0; col < NUM_COLS; col++) {
                Location l = new Location();
                l.setCol(col);
                l.setRow(row);
                
                if(Math.random() > 0.5 && numZombies > 0) {
                    Zombie z = new Zombie();
                    z.setDamage((int)(Math.random() * Zombie.MAX_ZOMBIE_DAMAGE));
                    z.setHitPoints((int)(Math.random() * Zombie.MAX_ZOMBIE_HITPOINTS));
                    l.setZombie(z);
                    numZombies--;
                }
                
                if(Math.random() > 0.8 && numItems > 0) {
                    Item i = null;
                    if(Math.random() > 0.5) {
                        i = new HealthKit();
                        i.setName("Medicine");
                    } else {
                        i = new Weapon();
                        i.setName("Baseball Bat");
                    }
                    i.setHitPoints(Item.MAX_HITPOINTS);
                    l.setItem(i);
                    numItems--;
                }
                matrix[row][col] = l;
            }
        }
        
    }
    
    
}
