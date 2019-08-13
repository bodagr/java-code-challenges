package codewars;

import java.util.HashMap;
import java.util.Map;

public class SortTheOdd {

    public static void main(String[] args) {
        System.out.println(sortArray(new int[] {5, 3, 2, 8, 1, 4})); // --> [1,3,2,8,5,4]
    }

                //Sort the odd
        //You have an array of numbers.
        //Your task is to sort ascending odd numbers but even numbers must be on their places.
        //Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

    public static int[] sortArray(int[] array) {

        // 5 3 2 8

        Map <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                continue;
            map.put(i, array[i]);
        }

        for (int j = 0; j <map.size()-1; j++) {
            int temp;
        }

        return array;
    }
}
