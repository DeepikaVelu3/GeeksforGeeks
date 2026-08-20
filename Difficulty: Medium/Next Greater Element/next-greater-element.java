class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <=  arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int x : result){
            list.add(x);
        }
        return list;
    }
}