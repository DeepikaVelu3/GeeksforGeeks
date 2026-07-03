class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0;
        int maxiSum = Integer.MIN_VALUE;
        for(int x : arr){
            sum += x;
            maxiSum = Math.max(maxiSum , sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxiSum;
    }
}
