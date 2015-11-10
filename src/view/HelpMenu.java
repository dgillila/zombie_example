/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Daniel
 */
public class HelpMenu extends View {

    public HelpMenu() {
        super("A - About this game\n"
                + "G - Goal of this game\n"
                + "B - How battling zombies works\n"
                + "E - Exit help menu\n");
    }

    /**
     * This just calls a method based on the input
     *
     * @param input
     */
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'A':
                about();
                break;
            case 'G':
                goalHelp();
                break;
            case 'B':
                battleHelp();
                break;
            case 'E':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }

        return true;
    }

    private void about() {
        System.out.println("This game was created by Bro G and it should be kind of fun");
    }

    private void goalHelp() {
        System.out.println("The objective of this game is to move around battling\n"
                + "zombies and collecting items until you find the exit");
    }

    private void battleHelp() {
        System.out.println("You will choose to do damage with or without an item\n"
                + "and then the zombie will take damage, if the zombie is\n"
                + "defeated, you will not take returning damage, but if the\n"
                + "zombie lives, then you will take return damage");

    }

}
