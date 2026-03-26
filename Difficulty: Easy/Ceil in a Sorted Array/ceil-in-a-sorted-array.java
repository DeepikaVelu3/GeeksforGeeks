// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int res = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= x){
                res = i;
                break;
            }
        }
        return res;
    }
}
