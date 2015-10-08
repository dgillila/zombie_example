/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class Zombie {
    
    public static final int MAX_ZOMBIE_DAMAGE = 9;
    public static final int MAX_ZOMBIE_HITPOINTS = 29;
    
    private int hitPoints;
    private int damage;
    
    public Zombie() {
        
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.hitPoints;
        hash = 53 * hash + this.damage;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zombie other = (Zombie) obj;
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Zombie{" + "hitPoints=" + hitPoints + ", damage=" + damage + '}';
    }
    
    //////////////////////////////////
    // METHODS
    /////////////////////////////////
    
    /**
     * Applies damage to this zombie.
     * 
     * @param damage
     * @return true if the zombie is defeated
     */
    public boolean applyDamage(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints < 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
