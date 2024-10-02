class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        char[] stoCharArray = s.toCharArray();
        for(char c:stoCharArray){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(frequencyList,(a,b)-> b.getValue() - a.getValue());
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer>entry:frequencyList){
            for(int i=0;i<entry.getValue();i++){
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}
