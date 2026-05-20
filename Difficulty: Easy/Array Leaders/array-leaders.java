class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n =arr.length;
        int a= arr[n-1];
        list.add(a);
        for(int i =n-2;i>=0;i--){
            if(arr[i] >= a){
                list.add(arr[i]);
                a=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
