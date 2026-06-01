package ArrayTraversal.Hashing.Twopointers;

public class twoSum {

    public static int[] twOSum(int[] arr, int target) {

        int left = 0;

        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            // Found target
            if (sum == target) {

                return new int[] {left, right};
            }

            // Need bigger sum
            else if (sum < target) {

                left++;
            }

            // Need smaller sum
            else {

                right--;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};

        int target = 6;

        int[] result = twOSum(arr, target);

        System.out.println(
                "Indices: " +result[0] + ", " +result[1]
        );
    }
}