class Solution {
    public int fib(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Variables to track the two previous numbers
        int prev2 = 0; // Represents fib(i-2)
        int prev1 = 1; // Represents fib(i-1)
        int current = 0; // Represents fib(i)

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // Sum of the two preceding numbers
            prev2 = prev1;           // Shift prev2 forward
            prev1 = current;         // Shift prev1 forward
        }

        return current;
    }
}
