class Solution {
    public int isValid(int[] arr,int mid){
        int part = 1;
        int total = 0;
        for(int i =0; i< arr.length;i++){
            if(total+arr[i] <= mid){
                total+= arr[i];
            }
            else{
                part++;
                total = arr[i];
            }
        }
        return part;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low = 0;
        int high = 0;
        for(int i = 0; i< arr.length;i++){
            low = Math.max(low , arr[i]);
            high+= arr[i];
            
        }
        while(low <= high){
            int mid = low+(high -low)/2;
            if(isValid(arr,mid) <= k){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
