package SortAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String... args) {
        int[] intArray = {35, 45, -50, 12, 18};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
                swap(intArray, largest, lastUnsortedIndex);
            }
        }
        System.out.println(Arrays.toString(intArray));

    }

    /**
     * O(n²) because is into two loops
     *
     * @param array general array
     * @param i largest index
     * @param j lastUnsorted intex
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            //You shouldn't swap it
            return;
        }
        //Swapping
        int temp = array[i]; // O(n)
        array[i] = array[j];
        array[j] = temp;

    }

}
