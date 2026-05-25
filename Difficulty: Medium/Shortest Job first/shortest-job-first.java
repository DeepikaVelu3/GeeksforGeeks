class Solution {
    static int solve(int bt[]) {
     
        // code here
        Arrays.sort(bt);
        int n =bt.length;
        int time=0;
        int avg = 0;
        for(int x : bt){
            avg+=time;
            time+=x;
        }
        return avg/n;
    }
}
