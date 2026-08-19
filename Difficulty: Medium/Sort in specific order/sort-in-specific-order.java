class Solution {
    public void sortIt(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
       
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenList.add(arr[i]);
            }
            else{
                oddList.add(arr[i]);
            }
        }
        int k = 0;
        for(int i = oddList.size()-1; i >= 0;i--){
            arr[k++] = oddList.get(i);
        }
        
        for(int i = 0; i < evenList.size(); i++){
            arr[k++] = evenList.get(i);
        }
        
    }
}
