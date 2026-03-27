// User function Template for Java

class Solution {
    public String arrangeString(String s) {
        // code here.
        ArrayList<Character> arr = new ArrayList<>();
        int sum = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                sum += ch -'0';
            }
            else{
                arr.add(ch);
            }
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(char x:arr){
            sb.append(x);
        }
        if(sum > 0){
            sb.append(sum);
        }
        return sb.toString();
    }
}
