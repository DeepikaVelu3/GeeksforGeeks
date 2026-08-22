class Solution {
    public String modify(String s) {
        // code here
        String vowels = "";
        for(char ch : s.toCharArray()){
            if(isValid(ch))
            vowels += ch;
        }
        StringBuilder sb = new StringBuilder();
        int k = vowels.length()-1;
        for(int i = 0; i < s.length(); i++){
            if(isValid(s.charAt(i))){
                sb.append(vowels.charAt(k));
                    k--;
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
        
        return sb.toString();
    }
    public boolean isValid(char ch){
        if(ch =='a' || ch =='e'|| ch=='i' || ch =='o' || ch=='u'||ch =='A' || ch =='E'|| ch=='I' || ch =='O' || ch=='U' ){
            return true;
        }
        return false;
    }
}