class Solution {
    public int divide(int dividend, int divisor) {

        // Handle the only positive overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Work with positive long values
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        // Determine the sign of the answer
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long quotient = 0;

        // Check powers of 2 from 31 down to 0
        for (int i = 31; i >= 0; i--) {

            if (a >= (b << i)) {

                a -= (b << i);

                quotient += (1L << i);
            }
        }

        // Apply the correct sign
        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}
