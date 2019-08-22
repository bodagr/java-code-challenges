package sorting;

public class BinarySearch {

    int binarySearch(int[] arr, int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r-l)/2;

            //if the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            //if element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);

            //Else the element can only be present in right subarray
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;

    }



    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int x = 2;  //number to find
        int result = ob.binarySearch(arr, 0, n-1, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + result);
    }
}
