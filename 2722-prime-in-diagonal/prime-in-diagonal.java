class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(prime(nums[i][i])){
                ans = Math.max(ans,nums[i][i]);
            }
            if(prime(nums[i][n-1-i])){
                ans = Math.max(ans,nums[i][n-1-i]);
            }
        }
        return ans;
    }
    private boolean prime(int n){
        if(n<2)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}