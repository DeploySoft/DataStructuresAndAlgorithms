package SortAlgorithms;

import java.util.Arrays;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/16/2020, Sun
 **/
public class InsertSort {


    public static void main(String[] args) {
        int[] intArray = {35, 45, -50, 12, 18};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                //Shifting here
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
