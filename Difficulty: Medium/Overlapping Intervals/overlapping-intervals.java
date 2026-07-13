class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0] , b[0]));
        int s = arr[0][0];
        int e = arr[0][1];
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        for(int i = 1; i < arr.length; i++){
            if(arr[i][0] <= e){
                e = Math.max(e, arr[i][1]);
            }
            else{
                list.add(new ArrayList<>(Arrays.asList(s,e)));
                s = arr[i][0];
                e = arr[i][1];
            }
        }
        list.add(new ArrayList<>(Arrays.asList(s,e)));
        return list;
    }
}