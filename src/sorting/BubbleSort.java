package sorting;

import java.util.Arrays;

public class BubbleSort {

            //Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

    public static void main(String[] args) {
        System.out.println(bubbleSort(new int[]{4,5,7,11,2,33,99,-45,8}));
        System.out.println(bubbleSort(new int[]{9,8,4,2,22,11,9,3,5}));
        System.out.println(bubbleSort(new int[]{6,2,-2,-78,66,12}));
    }

    public static String bubbleSort (int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return Arrays.toString(arr);
    }
}
