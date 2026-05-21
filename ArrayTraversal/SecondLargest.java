package ArrayTraversal;

public class SecondLargest {
    
    public static int SecondLargest (int [] arr, int n) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

public static void main(String []ar ){
    int [] arr = {7,6,3,4,5};
    int n = arr.length;
    System.out.println("The second largest element in the array is: " + SecondLargest(arr, n));    
}
}