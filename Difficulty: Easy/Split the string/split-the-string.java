// User function Template for Java
class Solution {
    static int isPossible(String S) {
        // code here
         int n = S.length();
         for(int i = 1; i< n - 2; i++){
             for(int j =i + 1; j < n - 1;j++) {
                 for(int k = j + 1; k < n ; k++){
                     String p1 = S.substring(0,i);
                     String p2 = S.substring(i,j);
                     String p3 = S.substring(j,k);
                     String p4 = S.substring(k);
                     
                     HashSet<String> hs = new HashSet<>();
                     hs.add(p1);
                     hs.add(p2);
                     hs.add(p3);
                     hs.add(p4);
                     
                     if(hs.size() == 4){
                         return 1;
                     }
                     
                     
                     
                 }
         }
         }
        return 0;
    }
}