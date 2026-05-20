class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int ones =0;
        int zeros=0;
        int maxi=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
                ones=0;
               maxi=Math.max(maxi,zeros);
            }
             
            if( arr[i]==1){
                ones++;
                zeros=0;
                  maxi = Math.max(maxi,ones);
            }
          
        }
        return maxi;
    
    }
}
