/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie;

import model.Map;
import model.Player;
import view.MainMenuView;
import view.WelcomeView;

/**
 *
 * @author Daniel
 */
public class Zombie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Player player = new Player();
//        
//        WelcomeView welcomeView = new WelcomeView();
//        welcomeView.displayBanner();
//        
//        player.setName(welcomeView.getPlayerName());
//        
//        welcomeView.displayPlayerNameBanner(player);
        
        MainMenuView mainView = new MainMenuView();
        mainView.display();
        
        
//        Map map = new Map();
//        map.initialize();
//        
//        System.out.println(map.toString());
        
//        Player mainCharacter = new Player();
//        Player second = new Player();
//        
//        System.out.println("main character's name: " + mainCharacter.getName());
//        
//        mainCharacter.setName("Daniel");
//        
//        System.out.println("main character's name: " + mainCharacter.getName());
        
    }
    
}
