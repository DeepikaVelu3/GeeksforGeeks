class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int[] num = new int[n];
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            num[i] = st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        for(int x : num){
            list.add(x);
        }
        return list;
    }
}