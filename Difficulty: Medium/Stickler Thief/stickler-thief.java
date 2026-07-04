class Solution {
    public int findMaxSum(int arr[]) {
     
         int incl = 0;
        int excl = 0;

        for (int money : arr) {
            int newExcl = Math.max(incl, excl);
            incl = excl + money;
            excl = newExcl;
        }

        return Math.max(incl, excl);
    }
}