class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        
        int prefix = 1;
        int suffix =1;
        for(int i =0 ;i < n;i++){
            prefix *= arr[i];
            suffix *= arr[n-i-1];
            maxi = Math.max(maxi,Math.max(prefix,suffix));
            
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix =1;
            }
        }
        return maxi;
    }
}