class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            l.add(arr[i]);
        }
        return l;
    }
}