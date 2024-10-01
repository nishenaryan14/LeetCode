class Solution {
    public String removeOuterParentheses(String s) {
        int charCount = 0;
        StringBuilder sb = new StringBuilder();
        char[] chArray = s.toCharArray();

        for(char c:chArray){
            if(c=='('){
                if(charCount>0){
                    sb.append(c);
                }
                charCount++;
            }
            else if(c==')'){
                charCount--;
                if(charCount>0){
                    sb.append(c);
                }
            }
        }
        
        return sb.toString();
    }
}
