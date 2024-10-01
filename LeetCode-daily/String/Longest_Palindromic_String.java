//this solution is without DP
class Solution {
    public String longestPalindrome(String s) {
        
        if(s==null || s.length()<1){
            return s;
        }
        int n = s.length();
        int start = 0,end = 0;
        for(int i=0;i<n;i++){

            int len1 = expandAroundCenter(s,i,i); //odd length string
            int len2 = expandAroundCenter(s,i,i+1); //even length string

            int len = Math.max(len1,len2);

            if(len>end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }

        return s.substring(start,end+1);
    }

    public int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
