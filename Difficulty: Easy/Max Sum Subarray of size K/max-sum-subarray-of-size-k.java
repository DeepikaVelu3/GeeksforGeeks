class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxi = 0;
        int sum=0;
       for(int i=0;i<k;i++){
           sum+=arr[i];
           
       }
       maxi = sum;
       for(int i=k;i<arr.length;i++){
           sum +=arr[i];
           sum -= arr[i-k];
           maxi = Math.max(maxi,sum);
       }
       return maxi;
    }
}