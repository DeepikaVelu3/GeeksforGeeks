class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        List<List<Integer>> l=new ArrayList<>();
        int prev=lower;
        
        for(int num : arr){
            if(prev<num){
                
            l.add(Arrays.asList(prev,num-1));
            }
               prev=num+1;
        
        }
     
       if(prev <= upper){
           l.add(Arrays.asList(prev,upper));
       }
       return l;
    }
}