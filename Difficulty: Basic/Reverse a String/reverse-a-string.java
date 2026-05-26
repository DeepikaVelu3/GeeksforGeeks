// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int left =0;
        int right = s.length()-1;
        char []ch = s.toCharArray();
        while(left<right){
         
              char temp = ch[left];
              ch[left] = ch[right];
              ch[right]=temp;
          
          left++;
          right--;
        }
       String str = new String(ch);
       return str;
    }
}