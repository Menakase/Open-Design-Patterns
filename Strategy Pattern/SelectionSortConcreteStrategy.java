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
public class SelectionSortConcreteStrategy implements SortStrategy {

    @Override
    public int[] sort(int unsortArray[]) {
        int n = unsortArray.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (unsortArray[j] < unsortArray[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = unsortArray[min_idx];
            unsortArray[min_idx] = unsortArray[i];
            unsortArray[i] = temp;
        }

        return unsortArray;
    }

}
