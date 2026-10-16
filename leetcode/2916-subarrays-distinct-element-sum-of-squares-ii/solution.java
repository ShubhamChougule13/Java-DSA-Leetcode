class Solution {
    private static final long MOD = 1_000_000_007L;

    class SegmentTree {
        long[] sum;
        long[] sumSquares;
        long[] lazy;
        int n;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            sumSquares = new long[4 * n];
            lazy = new long[4 * n];
        }

        void apply(int node, int left, int right, long val) {
            long len = right - left + 1L;
            long oldSum = sum[node];

            sumSquares[node] =
                (sumSquares[node] + 2L * val % MOD * oldSum
                + val * val % MOD * len) % MOD;

            sum[node] = (oldSum + val * len) % MOD;
            lazy[node] = (lazy[node] + val) % MOD;
        }

        void push(int node, int left, int right) {
            if (lazy[node] == 0 || left == right) {
                return;
            }

            int mid = left + (right - left) / 2;
            long val = lazy[node];

            apply(node * 2, left, mid, val);
            apply(node * 2 + 1, mid + 1, right, val);

            lazy[node] = 0;
        }

        void update(int node, int left, int right,
                    int ql, int qr, long val) {
            if (ql <= left && right <= qr) {
                apply(node, left, right, val);
                return;
            }

            push(node, left, right);

            int mid = left + (right - left) / 2;

            if (ql <= mid) {
                update(node * 2, left, mid, ql, qr, val);
            }

            if (qr > mid) {
                update(node * 2 + 1, mid + 1, right,
                       ql, qr, val);
            }

            sum[node] =
                (sum[node * 2] + sum[node * 2 + 1]) % MOD;

            sumSquares[node] =
                (sumSquares[node * 2]
                + sumSquares[node * 2 + 1]) % MOD;
        }

        void update(int left, int right, long val) {
            if (left <= right) {
                update(1, 0, n - 1, left, right, val);
            }
        }

        long getSumSquares() {
            return sumSquares[1];
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        int[] last = new int[100001];

        java.util.Arrays.fill(last, -1);

        SegmentTree tree = new SegmentTree(n);
        long answer = 0;

        for (int i = 0; i < n; i++) {
            int previous = last[nums[i]];

            tree.update(previous + 1, i, 1);

            answer = (answer + tree.getSumSquares()) % MOD;

            last[nums[i]] = i;
        }

        return (int) answer;
    }
}
