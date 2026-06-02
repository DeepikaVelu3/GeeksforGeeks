class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int left = 0;
        int zero = 0;
        int maxlen = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right] == 0){
                zero++;
            }
            while(zero > k){
                if(arr[left] ==0 ){
                    zero--;
                }
                left++;
            }
            
            
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}