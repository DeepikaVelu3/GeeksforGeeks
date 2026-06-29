class Solution {
    public int isValid(int[] stalls , int mid){
        int cows = 1;
        int lastpos = stalls[0];
        for(int x : stalls){
            if(x-lastpos >= mid){
                cows++;
                lastpos = x;
            }
           
        }
        return cows;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int low = 0;
        Arrays.sort(stalls);
        int n = stalls.length;
        int high = stalls[n-1] - stalls[0];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(stalls,mid) >=k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}