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
public class MainMenuView extends View {

    public MainMenuView() {
        super("Please select an option:\n"
                + "N - Begin new game\n"
                + "L - Load saved game\n"
                + "H - View help menu\n"
                + "E - Exit game\n");
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
                startNewGame();
                break;
            case 'L':
                loadGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'E':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }

        return true;

    }

    private void startNewGame() {
        //I'll need to actually create the game here, but for now let's just display the turn view
        TurnView t = new TurnView();
        t.display();
    }

    private void loadGame() {
        System.out.println("NOT IMPLEMENTED YET");
        //It is really important to call displayMenu() here so we repeat the menu
    }

    private void showHelpMenu() {
        //Create the new HelpMenu
        HelpMenu hm = new HelpMenu();
        //Call it's displayMenu() method which will loop until the user exits that menu
        hm.display();
    }
}
