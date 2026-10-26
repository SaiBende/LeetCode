class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // Base cases for small arrays
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Case 1: Rob houses from 0 to n - 2 (skip the last house)
        int maxSkippingLast = robLinear(nums, 0, n - 2);
        
        // Case 2: Rob houses from 1 to n - 1 (skip the first house)
        int maxSkippingFirst = robLinear(nums, 1, n - 1);

        return Math.max(maxSkippingLast, maxSkippingFirst);
    }

    private int robLinear(int[] nums, int start, int end) {
        int len = end - start + 1;
        if (len == 1) return nums[start];

        int[] dp = new int[len];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2], dp[i - 1]);
        }

        return dp[len - 1];
    }
}