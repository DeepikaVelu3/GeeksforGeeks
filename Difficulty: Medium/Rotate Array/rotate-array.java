class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d=d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
        
    }
    static void rotate(int arr[], int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}