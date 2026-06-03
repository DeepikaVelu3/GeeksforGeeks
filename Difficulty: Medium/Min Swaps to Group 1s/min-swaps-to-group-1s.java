class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int ones = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                ones++;
            }
        }
            if(ones == 0){
                return -1;
            }
            int currOne = 0; //no of ones in the current window
            for(int i = 0; i < ones; i++){
                if(arr[i] == 1){
                    currOne++;
                }
            }
            int maxOne = currOne; // store maximum no of one in the window size
            for(int i = ones; i < arr.length; i++){
                if(arr[i-ones] == 1){
                    currOne--;
                }
                if(arr[i] == 1){
                    currOne++;
                }
                maxOne = Math.max(currOne,maxOne);
            }
            
        
        return ones - maxOne;
    }
}
