package ArrayTraversal;

public class MoveZeros {

    public static void moveZerosToEnd(int[] arr, int n) {
    
        int k=0;

        for(int i=0;i<n;i++) {
            if(arr[i] !=0 ){

                int x = arr [i];
                arr[i] = arr[k];
                arr[k] = x;
                k++;
                
            }
        }


    }

public static void main(String[] args) {
    int [] arr = {0, 1, 0, 3, 12};
    int n = arr.length;
    moveZerosToEnd(arr, n);
    System.out.println("Array after moving zeros to the end: ");
    for (int i=0; i<n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
