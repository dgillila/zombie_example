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
public class BattleView extends View {
    
    public BattleView() {
        super("Please select an option:\n"
                + "A - Attack without Item\n"
                + "I - Attack with Item\n"
                + "H - View Health\n"
                + "R - Attempt to run\n");
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
                return attack();
            case 'I':
                return attackWithItem();
            case 'H':
                viewHealth();
                break;
            case 'R':
                return run();
            default:
                System.out.println("Please select a valid input.");
                break;
        }

        return true;

    }

    private boolean attack() {
        System.out.println("NOT IMPLEMENTED YET");
        return false;
    }

    private boolean attackWithItem() {
        System.out.println("NOT IMPLEMENTED YET");
        return false;
    }

    private void viewHealth() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private boolean run() {
        return false;
    }
}
