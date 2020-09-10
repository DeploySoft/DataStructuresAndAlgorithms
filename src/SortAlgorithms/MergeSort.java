package SortAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {35, 45, -50, 12, 18, 5, 6, -10};
        mergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));

    }


    public static void mergeSort(int[] input, int start, int end) {
        //breaking condition
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        //Recursive to the left part
        mergeSort(input, start, mid);
        //Recursive to the right part
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
