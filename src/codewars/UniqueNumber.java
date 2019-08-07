package codewars;

public class UniqueNumber {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[] {1,2,1,1}));

    }

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
}
