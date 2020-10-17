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
public class SortContext {
    //default BubbleSort
    private SortStrategy strategy = new BubbleSortConcreteStrategy();

    public SortStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] executeSortStrategy(int unsortArray[]) {
        return strategy.sort(unsortArray);
    }
}
