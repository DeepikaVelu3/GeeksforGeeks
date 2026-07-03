class Solution {
    public static int countDigits(int n) {
        // Code here
        int count = 0;
        while( n > 0){
            if(n != 0){
                count++;
            }
            int digit = n % 10;
            n = n /10;
            
        }
        return count;
    }
}
