class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            mp.put(arr[i] , mp.getOrDefault(arr[i],0)+1);
        }
        for(int x : mp.keySet()){
            ArrayList<Integer> l = new ArrayList<>();
            l.add(x);
            l.add(mp.get(x));
            result.add(l);
        }
        return result;
    }
}