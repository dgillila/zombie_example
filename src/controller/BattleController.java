/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Item;
import model.Player;
import model.Zombie;

/**
 *
 * @author Daniel
 */
public class BattleController {
    
    /**
     * This method applies the player's damage to the zombie without an item.
     * 
     * @param p The player
     * @param z The zombie
     * @return true if the zombie is defeated, false otherwise
     */
    public boolean attackZombie(Player p, Zombie z) {
        
        int playerDamage = (int)(Player.MAX_DAMAGE * Math.random()) + 1;
        
        z.setHitPoints(z.getHitPoints() - playerDamage);
        
        if(z.getHitPoints() <= 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean attackPlayer(Player p, Zombie z) {
        
        int zombieDamage = (int)(Zombie.MAX_ZOMBIE_DAMAGE * Math.random()) + 1;
        
        p.applyDamage(zombieDamage);
        
        if(p.getHitPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Damages a zombie using the player's damage plus the item damage
     * 
     * @param p the player
     * @param z the zombie
     * @param i the item being used
     * @return true if the item breaks, false otherwise
     */
    public boolean attackZombieWithItem(Player p, Zombie z, Item i) {
        
        int playerDamage = (int)(Player.MAX_DAMAGE * Math.random()) + 1 + i.getHitPoints();
        
        i.setDurability(i.getDurability() - 1);
        
        z.setHitPoints(z.getHitPoints() - playerDamage);
        
        if(i.getDurability() <= 0) {
            //We need to remove this item from the player's inventory
            p.getItems().remove(i);
            return true;
        }
   
        return false;
        
    }
}
