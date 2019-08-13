package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println(insertionSort(new int[]{0,4,88,-2,-1}));
        System.out.println(insertionSort(new int[]{9,8,4,2,22,11,9,3,5}));
        System.out.println(insertionSort(new int[]{6,2,-2,-78,66,12}));
    }

    /*
            Explanation:
    * The idea behind Insertion Sort is dividing the array into the sorted and unsorted subarrays.
    * The sorted part is of length 1 at the beginning and is corresponding to the first (left-most) element in the array.
    * We iterate through the array and during each iteration, we expand the sorted portion of the array by one element.
    * Upon expanding, we place the new element into its proper place within the sorted subarray. We do this by shifting all of the elements
    * to the right until we encounter the first element we don't have to shift.
    *
    * For example, 3 5 7 8 4 2 1 9 6: We take 4 and remember that that's what we need to insert.
    * Since 8 > 4, we shift; 7 > 4; 5 > 4 - shift
    *
    *After this process, the sorted portion was expanded by one element, we now have five rather than four elements. Each iteration does this and by the end we'll have the whole array sorted.

     */


    public static String insertionSort (int[] arr) {
        for (int i = 1; i <arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }



        return Arrays.toString(arr);
    }
}
