class Solution {
    static int []dp;
    public int fibodp(int n){
        if(n<=1){return n;}
        if(dp[n]!=0){return dp[n];}
        int ans=fibodp(n-1)+fibodp(n-2);
        dp[n]=ans;
        return ans;
    }
    public int fib(int n) {
        dp=new int[n+1];
        return fibodp(n);
    }
}
