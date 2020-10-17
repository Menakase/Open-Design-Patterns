/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author NanoX
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberListSorter mainWindow = new NumberListSorter();
        mainWindow.setVisible(true);
        mainWindow.pack();
    }

}
