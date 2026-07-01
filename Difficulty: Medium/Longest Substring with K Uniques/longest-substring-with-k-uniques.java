class Solution {
    public int longestKSubstr(String s, int k) {
        // code here'
        HashMap<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int left = 0;
        int maxi = -1;
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            mp.put(ch , mp.getOrDefault(ch,0)+1);
            while(mp.size() > k){
                mp.put(s.charAt(left) , mp.get(s.charAt(left)) -1);
                if(mp.get(s.charAt(left)) == 0){
                    mp.remove(s.charAt(left));
                }
                left++;
            }
            if(mp.size() == k)
            maxi = Math.max(maxi , right-left+1);
        }
        return maxi;
    }
}