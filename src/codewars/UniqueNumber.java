package codewars;

import java.util.Arrays;

public class UniqueNumber {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[] {1,2,1,1}));
        System.out.println(findUniq2(new double[] {1,2,1,1}));
    }

            //Find the unique number
        //There is an array with some numbers. All numbers are equal except for one. Try to find it!
        //new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2

            //#1
    public static double findUniq(double arr[]) {
        double x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (x != arr[i] && i != arr.length-1) {
                if (x == arr[i+1]) {
                    x = arr[i];
                    break;
                } else {
                    return x;
                }
            } else
                x = arr[i];
        }
        return x;
    }

            //#2
    public static double findUniq2(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}
