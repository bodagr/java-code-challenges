package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTargets {

    public static void main(String[] args) {

        int[] arr = {44,1,23,4,0,6,5,2,9,3}; //1+3; 3+1; 4+6; 7+9; 9+7
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = 5;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (x == (arr[i] + arr[j]))
//                    System.out.println("Sum of: " + i + " + " + j);
//            }
//        }

//        for (int i = 0; arr[i] <= x; i++) {
//            for (int j = i; arr[j] <= x ; j++) {
//                if (x == (arr[i] + arr[j]))
//                    System.out.println("Sum of: " + i + " + " + j);
//            }
//        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){ // value : index
            map.put(arr[i],i);
        }
        for(int i = 0; i<=arr.length; i++){
            boolean exists = map.containsKey(x-arr[i]);  // 5 - value
            if(exists){
                System.out.println("sum=" + i + map.get(x - arr[i]));
            }
        }




    }
}
