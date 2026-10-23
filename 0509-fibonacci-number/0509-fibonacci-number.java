class Solution {
    public int fibodp(int n,int []dp){
        if(n<=1){return n;}
        if(dp[n]!=0){return dp[n];}
        int ans=fibodp(n-1,dp)+fibodp(n-2,dp);
        dp[n]=ans;
        return ans;
    }
    public int fib(int n) {
        int []dp=new int[n+1];
        return fibodp(n,dp);
    }
}
