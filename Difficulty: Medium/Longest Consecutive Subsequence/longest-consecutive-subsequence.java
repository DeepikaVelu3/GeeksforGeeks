class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            int current = arr[i]; 
         if(!set.contains(current-1)){
           
             while(set.contains(current+1)){
             count++;
             current = current+1;
         }
         }
        
         maxCount = Math.max(count , maxCount);
        }
        return maxCount;
    }
}