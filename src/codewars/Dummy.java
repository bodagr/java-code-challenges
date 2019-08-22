package codewars;

public class Dummy {

    public static void main(String args[]) {

        Dummy ob = new Dummy();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int x = 2;

        int result = ob.binarySearch(arr, 0, n-1, x);
        if (result == -1)
            System.out.println("Not present");
        else
            System.out.println("Present on ---> " + result);
    }

    int binarySearch(int[] arr, int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r-l)/2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid-1, x);
            }
            else
                return binarySearch(arr, mid+1, r, x);
        }
        return -1;

    }



}
