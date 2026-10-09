class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int right = s.length() - 1;

        while (right >= 0) {

            
            if (s.charAt(right) == ' ') {
                right--;
                continue;
            }

           
            int left = right;

           
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }

            
            if (ans.length() > 0) {
                ans.append(' ');
            }

            
            ans.append(s.substring(left + 1, right + 1));

            
            right = left;
        }

        return ans.toString();
    }
}