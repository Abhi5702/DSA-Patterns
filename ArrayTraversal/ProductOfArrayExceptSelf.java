package ArrayTraversal;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Calculate the product of all elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate the product of all elements to the right of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);

        System.out.print("Product of array except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
