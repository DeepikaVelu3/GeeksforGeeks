class Solution {
    int thirdLargest(int arr[]) {
        // code here
       int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i] > first ){
                third = second;
                second = first;
                first = arr[i];
                
            }
            else if(arr[i] > second  ){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third){
                third = arr[i];
            }
            
        }
        if(third == Integer.MIN_VALUE){
            return -1;
        }
        return third;
    }
}