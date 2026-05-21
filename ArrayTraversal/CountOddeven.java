package ArrayTraversal;

public class CountOddeven {

    public static void Count (int [] arr, int n) {
        int oddCount = 0;
        int evenCount = 0;

        for (int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }

    public static void main(String []args){
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        Count(arr, n);    
    }
    
}
