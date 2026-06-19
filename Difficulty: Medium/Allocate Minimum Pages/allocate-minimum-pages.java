class Solution {
    public int isTotalBook(int[] arr , int mid){
        int book = 1;
        int pageSum = 0;
        for(int i : arr){
            if(pageSum + i <= mid){
                pageSum += i;
            }
            else{
                book++;
                pageSum = i;
            }
        }
        return book;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int low = 0;
         int high = 0;
         if(arr.length < k){
             return -1;
         }
         for(int i : arr){
             low = Math.max( low , i );
             high += i;
         }
         while(low <= high){
             int mid = low + ( high - low ) / 2;
             if(isTotalBook(arr , mid) <= k){
                 high = mid - 1;
             }
             else{
                 low = mid + 1;
             }
            
         }
        return low;
    }
}