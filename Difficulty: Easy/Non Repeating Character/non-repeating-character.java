class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int n = s.length();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            char x = s.charAt(i);
            mp.put(x, mp.getOrDefault(x,0) + 1);
        }
    
        for(char x : s.toCharArray()){
            if(mp.get(x) == 1){
               return x; 
            }
        }
       return '$';
    }
}
