package ArrayTraversal.Hashing.Twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        
        Arrays.sort(arr);

        int n = arr.length;

        
        for (int i = 0; i < n - 2; i++) {

            
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;

            int right = n - 1;

            // Step 3: Two pointers
            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                // Triplet found
                if (sum == 0) {

                    result.add(
                            Arrays.asList(arr[i], arr[left], arr[right])
                    );

                    // Skip duplicate left values
                    while (left < right &&
                            arr[left] == arr[left + 1]) {

                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                            arr[right] == arr[right - 1]) {

                        right--;
                    }

                    left++;
                    right--;
                }

                // Need bigger sum
                else if (sum < 0) {

                    left++;
                }

                // Need smaller sum
                else {

                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum(arr);

        System.out.println(result);
    }
}