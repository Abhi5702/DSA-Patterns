package ArrayTraversal;

public class FindLargest {

    public static int Largest (int [] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    


public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5};
    int n = arr.length;
    System.out.println("The largest element in the array is: " + Largest(arr, n));
}
}