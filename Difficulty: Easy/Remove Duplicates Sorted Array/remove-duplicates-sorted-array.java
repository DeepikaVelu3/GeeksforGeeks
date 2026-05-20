class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i : set){
            list.add(i);
        }
        return list;
    }
}
