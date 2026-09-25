import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        
        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

           
            window[s.charAt(i) - 'a']++;

            
            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }

           
            if (i >= k - 1 && Arrays.equals(window, need)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }
}
