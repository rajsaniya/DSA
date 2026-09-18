class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] charCounts = new int[26];
        
        
        for (int i = 0; i < magazine.length(); i++) {
            charCounts[magazine.charAt(i) - 'a']++;
        }
        
       
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            charCounts[index]--;
            
            
            if (charCounts[index] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
