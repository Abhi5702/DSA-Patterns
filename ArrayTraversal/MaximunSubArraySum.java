package ArrayTraversal;

public class MaximunSubArraySum {

    public static int maxSubArray (int[] arr, int n) {

        int maxSum =0;
        int curSum =0;

        for(int i=0;i<n;i++){

            curSum = curSum + arr[i];

            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum =0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        System.out.println("The maximum subarray sum is: " + maxSubArray(arr, n));
    }
    
}
