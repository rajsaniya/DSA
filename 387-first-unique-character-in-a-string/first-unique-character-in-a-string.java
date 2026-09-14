class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> Map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char Ch = s.charAt(i);
            Map.put(Ch,Map.getOrDefault(Ch,0)+1);

        }
        for(int i=0;i<s.length();i++){
            char Ch = s.charAt(i);
            if(Map.get(Ch)==1){
                return i;
            }
        }
        return -1;
    }
}