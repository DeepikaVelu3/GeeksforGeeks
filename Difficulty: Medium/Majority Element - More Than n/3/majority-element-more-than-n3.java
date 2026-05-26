class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
       //double m= Math.floor(n/3);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x =0;x<arr.length;x++){
            mp.put(arr[x],mp.getOrDefault(arr[x],0)+1);
        }
        for(int x : mp.keySet()){
            if(mp.get(x) > Math.floor(n/3)){
                list.add(x);
            }
        }
        Collections.sort(list);
        return list;
    }
}