/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Item;
import model.Player;
import model.Zombie;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class BattleControllerTest {
    
    public BattleControllerTest() {
    }

    /**
     * Test of attackZombie method, of class BattleController.
     */
    @Test
    public void testAttackZombie() {
        System.out.println("attackZombie");
        Player p = new Player();
        Zombie z = new Zombie();
        z.setHitPoints(100);
        BattleController instance = new BattleController();
        boolean expResult = false;
        boolean result = instance.attackZombie(p, z);
        assertEquals(expResult, result);
        
        z.setHitPoints(1);
        result = instance.attackZombie(p, z);
        assertEquals(true, result);
    }

    /**
     * Test of attackPlayer method, of class BattleController.
     */
//    @Test
//    public void testAttackPlayer() {
//        System.out.println("attackPlayer");
//        Player p = null;
//        Zombie z = null;
//        BattleController instance = new BattleController();
//        boolean expResult = false;
//        boolean result = instance.attackPlayer(p, z);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of attackZombieWithItem method, of class BattleController.
     */
    @Test
    public void testAttackZombieWithItem() {
        System.out.println("attackZombieWithItem");
        
        Player p = new Player();
        Zombie z = new Zombie();
        z.setHitPoints(100);
        Item i = new Item();
        i.setDurability(10);
        i.setHitPoints(5);
        p.getItems().add(i);
        BattleController instance = new BattleController();
        
        boolean expResult = false;
        boolean result = instance.attackZombieWithItem(p, z, i);
        assertEquals(expResult, result);
        assertTrue(z.getHitPoints() < 95);
        assertTrue(i.getDurability() == 9);
        
        z.setHitPoints(100);
        i.setDurability(1);
        i.setHitPoints(5);
        expResult = true;
        result = instance.attackZombieWithItem(p, z, i);
        assertEquals(expResult, result);
        assertTrue(i.getDurability() == 0);
        assertTrue(z.getHitPoints() < 95);
        
    }
    
}
