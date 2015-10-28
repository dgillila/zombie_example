/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Player;

/**
 *
 * @author Daniel
 */
public class WelcomeView {
    
    public WelcomeView() {
        
    }
    
    public void displayBanner() {
        
        System.out.println("*********************************");
        System.out.println("Welcome to Racoon City.");
        System.out.println("You wake up in a hotel room feeling lost and confused.");
        System.out.println("You don't remember how you got here or why you");
        System.out.println("are even here. Suddenly, something slams into the hotel room door.");
        System.out.println("After a short time, you hear scratching against the door.");
        System.out.println("You pick up the lamp on the nightstand and approach the door.");
        System.out.println("As you turn the doorknob someone pushes their way into your room and falls onto the floor,");
        System.out.println("but you quickly realize they're not really a person by their smell and appearance.");
        System.out.println("It's a zombie. You smash it in the head with your lamp and realize this night");
        System.out.println("is going to be a fight for your life.");
        System.out.println("");
        System.out.println("Good luck survivor.");
        System.out.println("************************************");
        
    }
    
    public String getPlayerName() {
        
        Scanner in = new Scanner(System.in);
        String name = "";
        
        while(name.length() < 2) {
            System.out.println("Please enter your name: ");
            name = in.nextLine();
            
            if(name.length() < 2) {
                System.out.println("Please enter a name with at least 2 characters");
            }
        }
        
        return name;
    }
    
    public void displayPlayerNameBanner(Player p) {
        
        System.out.println("*******************************");
        System.out.println("Welcome " + p.getName() + "!");
        System.out.println("We hope you enjoy this game");
        System.out.println("*******************************");
        
    }
    
}
