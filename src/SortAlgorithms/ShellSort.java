package SortAlgorithms;

import java.util.Arrays;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/25/2020, Tue
 **/
public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = {35, 45, -50, 12, 18, 55, 75};
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(intArray));

    }
}
