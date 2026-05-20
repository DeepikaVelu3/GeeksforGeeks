class Solution {
    int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int maxi = 0;
        int option1 = arr[n-1]*arr[n-2]*arr[n-3];
        int option2 = arr[0]*arr[1]*arr[n-1];//[-10,-10,-5,2] ie,..-10*-10*2
        maxi = Math.max(option1,option2);
        return maxi;
    }
}
