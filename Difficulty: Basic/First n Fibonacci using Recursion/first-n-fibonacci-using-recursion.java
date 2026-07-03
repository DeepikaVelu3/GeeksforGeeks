class Solution {
    public static int fib(int n){
        
    if(n == 0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    return fib(n-1)+fib(n-2);
        
        
    }    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
       List<Integer> list = new ArrayList<>();
       for(int i = 0; i < n; i++){
           list.add(fib(i));
       }
       int[] arr = new int[n];
       int i =0;
       for(int x : list){
           arr[i++] = x;
       }
       return arr;
    
    }
}