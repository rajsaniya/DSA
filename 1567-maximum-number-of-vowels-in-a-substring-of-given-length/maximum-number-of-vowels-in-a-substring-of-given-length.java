
class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int maxCount = 0;

      
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                count++;
            }
        }

        maxCount = count;

        
        for (int i = k; i < s.length(); i++) {

           
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            if (isVowel(s.charAt(i))) {
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
