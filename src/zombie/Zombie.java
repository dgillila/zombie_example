/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie;

import model.Map;

/**
 *
 * @author Daniel
 */
public class Zombie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map map = new Map();
        map.initialize();
        
        System.out.println(map.toString());
        
    }
    
}
