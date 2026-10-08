class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();

        int n = arr.length;
        int i = 0;

        while (i < n) {

            
            int start = i;

            
            while (i < n && arr[i] != ' ') {
                i++;
            }


            int end = i - 1;

           
            while (start < end) {

                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            
            i++;
        }

        return new String(arr);
    }
}