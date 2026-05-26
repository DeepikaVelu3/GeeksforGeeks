class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> mp =new HashMap<>();
        
        for(int right =0;right<arr.length;right++){
            mp.put(arr[right] ,mp.getOrDefault(arr[right],0)+1);
           
            }
        for(int i : mp.keySet()){
            if(mp.get(i) > n/2){
                return i;
            }
        }
        return -1;
        }
}