import java.util.*;

class Solution {
    public int totalElements(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        
        for(int right = 0; right < arr.length; right++){
            mp.put(arr[right], mp.getOrDefault(arr[right], 0) + 1);
            while(mp.size() > 2){
                mp.put(arr[left], mp.get(arr[left]) - 1);
                if(mp.get(arr[left]) == 0){
                    mp.remove(arr[left]);
                }
                
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}