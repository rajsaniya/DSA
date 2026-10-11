class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1_000_000_007;
        int total = n * (n + 1) / 2;

        int[] sums = new int[total];
        int index = 0;

        
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                sums[index] = sum;
                index++;
            }
        }

       
        Arrays.sort(sums);

        
        long answer = 0;

        for (int i = left - 1; i < right; i++) {
            answer = (answer + sums[i]) % mod;
        }

        return (int) answer;
    }
}