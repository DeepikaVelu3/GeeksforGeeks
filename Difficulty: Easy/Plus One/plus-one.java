// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
      
       int n = arr.size();
      
       for(int i = n - 1; i >= 0; i--){
            if( arr.get(i) < 9){
                //arr.get[i]++;
                arr.set(i , arr.get(i)+1);
                return arr;
            }
            arr.set(i , 0);
       } 
        ArrayList<Integer> arr1 = new ArrayList<>();
       arr1.add(1);
       
       for(int i = 0; i < n ; i++) {
           arr1.add(0);
       }
       return arr1;
    
    }
};