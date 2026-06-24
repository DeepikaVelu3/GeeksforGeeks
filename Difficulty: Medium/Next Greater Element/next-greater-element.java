class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
      Stack<Integer> st = new Stack<>(); 
      int[] res = new int[arr.length];
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = arr.length-1; i >= 0; i--){
          while(!st.empty() && st.peek() <= arr[i]){
              st.pop();
          }
        res[i]= st.empty() ? -1 :st.peek();
         st.push(arr[i]);
      }
      for(int i : res){
          list.add(i);
      }
      return list;
    }
}