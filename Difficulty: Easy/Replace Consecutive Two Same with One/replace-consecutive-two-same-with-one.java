class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder br = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            char one = s.charAt(i);
            while(i < s.length() &&s.charAt(i) == one){
                i++;
            }
            br.append(one);
        }
        return br.toString();
    }
}