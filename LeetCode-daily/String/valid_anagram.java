class Solution {
    public boolean isAnagram(String s, String t) {

        // method 1:
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean isAnagram = Arrays.equals(charArray1,charArray2);

        return isAnagram;

        //method 2:
        
        // HashMap<Character,Integer> map1 = new HashMap<>();
        // if(s.length() != t.length()){
        //     return false;
        // }
        // char[] charArray1 = s.toCharArray();
        // char[] charArray2 = t.toCharArray();

        // for(char c:charArray1){
        //     map1.put(c,map1.getOrDefault(c,0)+1);
        // }

        // for(char c:charArray2){
        //     if(!map1.containsKey(c)){
        //         return false;
        //     }
        //     else{
        //         int count = map1.get(c);
        //         if(count == 1){
        //             map1.remove(c);
        //         }
        //         else{
        //             map1.put(c,count-1);
        //         }
        //     }
        // }
        // return map1.isEmpty();
    }
}
