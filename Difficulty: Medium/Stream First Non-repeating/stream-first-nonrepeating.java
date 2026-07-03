class Solution {
    public String firstNonRepeating(String s) {
      StringBuilder sb = new StringBuilder();
      int[] freq = new int[26];
      Queue<Character> q = new LinkedList<>();
      for(int i = 0; i < s.length(); i++){
          char ch = s.charAt(i);
          freq[ch -'a']++;
          q.offer(ch);
          while(!q.isEmpty() && freq[q.peek()-'a'] >1){
              q.poll();
          }
          if(q.isEmpty()){
             sb.append('#');
          }
          else{
           sb.append(q.peek());   
          }
          
      }
      return sb.toString();
    }
}