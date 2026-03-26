class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new  ArrayList<>();
        for(int i = 0; i < n; i++){
             if(arr.get(i) >= 0){
                 pos.add(arr.get(i));
             }
             else{
                 neg.add(arr.get(i));
             }
        }
        
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < pos.size()  && j < neg.size()){
                 arr.set(k++ , pos.get(i++));
                 arr.set(k++ , neg.get(j++));
        }
        
        while(i < pos.size()){
                 arr.set(k++ , pos.get(i++));
        }
        
        while(j < neg.size()){
                  arr.set(k++ , neg.get(j++));
        }
    }
}