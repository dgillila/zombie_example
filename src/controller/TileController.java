/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Location;
import model.Player;

/**
 *
 * @author Daniel
 */
public class TileController {
    
    public boolean isBattle(Location l) {
        if(l.hasZombie()) {
            return true;
        }
        return false;
    }
    
    public void pickupItem(Player p, Location l) {
        if(l.hasItem()) {
            p.getItems().add(l.getItem());
            l.setItem(null);
        }
    }
    
}
