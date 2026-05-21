package ArrayTraversal;

public class LinearSearch {
    public static int Search (int [] arr, int n, int key) {
        for (int i=0; i<n; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    } 

        public static void main(String []args){
            int [] arr = {1,2,3,4,5};
            int n = arr.length;
            int key = 3;
            int result = Search(arr, n, key);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }
