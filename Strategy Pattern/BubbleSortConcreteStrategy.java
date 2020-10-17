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
public class BubbleSortConcreteStrategy implements SortStrategy {

    @Override
    public int[] sort(int unsortArray[]) {

        int n = unsortArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (unsortArray[j] > unsortArray[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = unsortArray[j];
                    unsortArray[j] = unsortArray[j + 1];
                    unsortArray[j + 1] = temp;
                }
            }
        }
        
        return unsortArray;
    }

}
