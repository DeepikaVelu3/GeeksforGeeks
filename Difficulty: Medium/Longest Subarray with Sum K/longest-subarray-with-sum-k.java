// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int k) {
        // code here
        int sum = 0;
        int maxlen = 0;
        HashMap<Integer , Integer > mp = new HashMap<>();
        for(int i = 0;i < nums.length; i++ ){
            sum = sum + nums[i];
            if(sum == k){
                maxlen = i +1;
            }
            if(!mp.containsKey(sum)){
                mp.put(sum ,i);
            }
            if(mp.containsKey(sum-k)){
            maxlen = Math.max(maxlen,i-mp.get(sum-k));
            }
        }
        return maxlen;
    }
}
