class Solution {
    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\s+");
        int i = 0;
        int j = wordsArray.length - 1;

        while(i<j){
            String temp = wordsArray[i];
            wordsArray[i] = wordsArray[j];
            wordsArray[j] = temp;
            i++;
            j--;
        }

        return String.join(" ",wordsArray);

    }
}
