class Solution {
    public int isPartioningCount(int[] arr ,int mid){
        int partitioning = 1;
        int sum = 0;
        for(int i : arr){
            if(sum + i <= mid){
                sum+= i;
            }
            else{
                partitioning++;
                sum = i;
                
            }
        }
         return partitioning;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int low = 0;
        int high = 0;
        for(int i  : arr){
            low = Math.max(low,i);
            high += i;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPartioningCount(arr , mid) <=k){
                high = mid-1;
                
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
};