package ArrayTraversal.Hashing;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement exists
            if (map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }

            // Store current element and index
            map.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 13;

        int[] result = twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}