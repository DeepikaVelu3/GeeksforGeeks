// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();
        int n = arr.length;
        for(int i=n-1; i >=0; i--){
            if(arr[i] <9){
                arr[i]++;
                break;
            }
            arr[i]=0;
            if(arr[0]==0){
                result.add(1);
            }
        }
        for(int a: arr){
            result.add(a);
        }
        return result;
    }
}