/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class MainMenuView {

    public MainMenuView() {

    }

    public void displayMenu() {
        //Display all of the text we want
        System.out.println("Please select an option:");
        System.out.println("N - Begin new game");
        System.out.println("L - Load saved game");
        System.out.println("H - View help menu");
        System.out.println("E - Exit game");
        //Then capture the character the user input
        char in = getInput();
        //Then perform the action
        doAction(in);
    }

    /**
     * This just get's the player's input
     * @return 
     */
    public char getInput() {

        Scanner in = new Scanner(System.in);

        String input = "";
        char rtn = 0;

        while (input.length() < 1) {
            input = in.nextLine();

            if (input.length() < 1) {
                System.out.println("Please select an option");
            } else {
                rtn = input.toUpperCase().charAt(0);
            }
        }

        return rtn;
    }

    /**
     * This just calls a method based on the input
     * @param input 
     */
    public void doAction(char input) {

        switch (input) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'E':
                exitGame();
                break;
            default:
                System.out.println("Please select a valid input.");
                displayMenu();
        }

    }

    private void startNewGame() {
        System.out.println("NOT IMPLEMENTED YET");
        //It is really important to call displayMenu() here so we repeat the menu
        displayMenu();
    }

    private void loadGame() {
        System.out.println("NOT IMPLEMENTED YET");
        //It is really important to call displayMenu() here so we repeat the menu
        displayMenu();
    }

    private void showHelpMenu() {
        //Create the new HelpMenu
        HelpMenu hm = new HelpMenu();
        //Call it's displayMenu() method which will loop until the user exits that menu
        hm.displayMenu();
        //Then when we finally jump out of help menu, call the main menu's display menu
        //It is really important to call displayMenu() here so we repeat the menu
        displayMenu();
    }

    private void exitGame() {
        //DON'T CALL displayMenu() HERE - this allows the code to break the cycle.
    }

}
