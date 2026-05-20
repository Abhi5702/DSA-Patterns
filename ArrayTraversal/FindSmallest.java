package ArrayTraversal;

public class FindSmallest {

    public static int Smallest (int [] arr, int n) {

        int min = arr[0];
        for (int i=1 ; i<n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

}    
public static void main(String []args){
    int [] arr = {1,2,3,4,5};
    int n = arr.length;
    System.out.println("The smallest element in the array is: " + Smallest(arr, n));    
}

}
