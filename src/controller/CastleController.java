/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Item;
import model.Location;
import model.Player;

/**
 *
 * @author Daniel
 */
public class CastleController {
    
    public boolean isGameWin(Player p) {
        for(Item i : p.getItems()) {
            if(i.getName().equals("orb")) {
                return true;
            }
        }
        
        return false;
    }
    
    public void takeBucket(Player p, Location l) {
        
        if(l.hasItem() && l.getItem().getName().equals("bucket")) {
            p.getItems().add(l.getItem());
        }
        
    }
    
    
    
}
