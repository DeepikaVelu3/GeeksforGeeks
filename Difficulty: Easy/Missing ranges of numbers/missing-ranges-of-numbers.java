class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        List<List<Integer>> l=new ArrayList<>();
        int prev=lower-1;
        
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            if(curr-prev>=2)
            l.add(Arrays.asList(prev+1,curr-1));
            prev=curr;
           
        }
        if(upper-prev>=1)
            l.add(Arrays.asList(prev+1,upper));
        return l;
    }
}