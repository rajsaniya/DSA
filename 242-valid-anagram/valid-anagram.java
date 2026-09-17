import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are not the same, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count frequencies of characters in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Decrement frequencies for string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            // If character isn't in s, it's not an anagram
            if (!map.containsKey(ch)) {
                return false;
            }
            
            // Corrected syntax: properly subtract 1 from the frequency
            map.put(ch, map.get(ch) - 1);
            
            // If count drops below 0, t has more copies of ch than s does
            if (map.get(ch) < 0) {
                return false;
            }
        }
        
        return true;
    }
}
