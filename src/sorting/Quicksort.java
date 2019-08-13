package sorting;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] arr = {10,5,3,1,-5,44};
        int n = arr.length;

        Quicksort ob = new Quicksort();
        System.out.println(ob.sort(arr, 0, n-1));
    }

    /*
                Explanation:
          * Quicksort is Divide and Conquer algorithm. It picks one element of an array as the pivot and sorts all of the other elements around
          * it, for example smaller elements to the left, and larger to the right.
          * This guarantees that the pivot is in its proper place after the process. Then the algorithm recursively does the same for the left and right portions of the array.

     */

    static int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of small el
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static String sort (int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }

        return Arrays.toString(arr);
    }



}
