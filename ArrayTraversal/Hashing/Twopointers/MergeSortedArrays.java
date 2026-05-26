package ArrayTraversal.Hashing.Twopointers;

public class MergeSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {

        int n1 = arr1.length;

        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {

                result[k] = arr1[i];

                i++;
            }

            else {

                result[k] = arr2[j];

                j++;
            }

            k++;
        }

        // Remaining elements of arr1
        while (i < n1) {

            result[k] = arr1[i];

            i++;
            k++;
        }

        // Remaining elements of arr2
        while (j < n2) {

            result[k] = arr2[j];

            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};

        int[] arr2 = {2,4,6};

        int[] result = merge(arr1, arr2);

        System.out.print("Merged Array: ");

        for(int num : result) {

            System.out.print(num + " ");
        }
    }
}