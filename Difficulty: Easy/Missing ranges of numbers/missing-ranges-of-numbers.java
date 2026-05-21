class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        int n = arr.length;
        int prev = lower;
        List<List<Integer>> list = new ArrayList<>();
       
        for(int i = 0 ;i < n; i++){
            if(prev < arr[i]){
                 list.add(Arrays.asList(prev,arr[i]-1));
            }
            prev=arr[i]+1;
             
            
        }
        if(prev <=upper){
                 list.add(Arrays.asList(prev,upper));
             }
        return list;
        
    }
}