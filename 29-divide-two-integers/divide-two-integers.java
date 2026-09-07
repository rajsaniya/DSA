class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        
        boolean negative = (dividend < 0) ^ (divisor < 0);

        int a = dividend;
        int b = divisor;

        if (a > 0) a = -a;
        if (b > 0) b = -b;

        int quotient = 0;

        while (a <= b) {
            int value = b;
            int count = -1;

            
            while (value >= Integer.MIN_VALUE - value && a <= value + value) {
                value += value;
                count += count;
            }

            a -= value;
            quotient += count;
        }

        return negative ? quotient : -quotient;
    }
}
