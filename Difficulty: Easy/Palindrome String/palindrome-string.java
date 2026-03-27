class Solution {
    boolean isPalindrome(String s) {
       
        String s2="";
        int j =s.length()-1;
        int i = 0;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
       
        
          return true;  
        
        
    }
}