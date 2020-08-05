package SortAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String... args) {
        int[] rightToLef = {35, 45, -50, 12, 18};
        int[] leftToRight = {35, 45, -50, 12, 18};

        //Bubble sort reading right to left
        for (int lastUnsortedIndex = rightToLef.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (rightToLef[i] > rightToLef[i + 1]) { //Here you determine ascending or descending
                    swap(rightToLef, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(rightToLef));

        //Bubble sort reading left to right
        for (int lastUnsortedIndex = 0; lastUnsortedIndex < leftToRight.length - 1; lastUnsortedIndex++) {
            for (int i = leftToRight.length - 1; i > lastUnsortedIndex; i++) {
                if (leftToRight[i] < leftToRight[i + 1]) {
                    swap(leftToRight, i, i - 1);
                }
            }
        }


        System.out.println(Arrays.toString(leftToRight));
    }

    /**
     * O(n²) because is into two loops
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            //You shouldn't swap it
            return;
        }
        //Swaping
        int temp = array[i]; // O(n)
        array[i] = array[j];
        array[j] = temp;

    }

}
