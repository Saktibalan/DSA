class Solution {
    public double myPow(double x, int n) {
        if (x == 0)
            return 0;
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return vPow(x, N);
    }

    private double vPow(double x, Long N) {
        if (N == 0)
            return 1;
        double div = vPow(x, N / 2);

        if (N % 2 == 0)
            return div * div;
        return x * div * div;
    }

}