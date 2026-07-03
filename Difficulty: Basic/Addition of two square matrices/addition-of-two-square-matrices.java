class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        int r = matrixA.length;
        int col = matrixA[0].length;
        for(int i = 0;i<r;i++){
            for(int j = 0; j <col;j++){
                matrixA[i][j] = matrixA[i][j]+matrixB[i][j];
            }
        }
    }
}