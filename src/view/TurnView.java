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
public class TurnView extends View {

    public TurnView() {
        super("Please select an option:\n"
                + "N - Move North\n"
                + "E - Move East\n"
                + "S - Move South\n"
                + "W - Move West\n"
                + "I - Look for items\n"
                + "G - Save Game\n"
                + "Q - Quit to Main Menu\n");
    }

    /**
     * This just calls a method based on the input
     *
     * @param input
     */
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'N':
                moveNorth();
                break;
            case 'E':
                moveEast();
                break;
            case 'S':
                moveSouth();
                break;
            case 'W':
                moveWest();
                break;
            case 'I':
                lookForItems();
                break;
            case 'G':
                saveGame();
                break;
            case 'Q':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }

        return true;
    }

    private void moveNorth() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveEast() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveSouth() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveWest() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void lookForItems() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void saveGame() {
        System.out.println("NOT IMPLEMENTED YET");
    }

}
