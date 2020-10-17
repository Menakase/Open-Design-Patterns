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
public class InsertionSortConcreteStrategy implements SortStrategy {

    @Override
    public int[] sort(int unsortArray[]) {
        int n = unsortArray.length;
        for (int i = 1; i < n; ++i) {
            int key = unsortArray[i];
            int j = i - 1;
            while (j >= 0 && unsortArray[j] > key) {
                unsortArray[j + 1] = unsortArray[j];
                j = j - 1;
            }
            unsortArray[j + 1] = key;
        }

        return unsortArray;
    }

}
