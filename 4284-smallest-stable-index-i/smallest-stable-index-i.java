class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] smallfromidx = new int[n];

        smallfromidx[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--){
            smallfromidx[i] = Math.min(nums[i], smallfromidx[i + 1]);
        }

        int maxi = nums[0];

        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, nums[i]);

            if(maxi - smallfromidx[i] <= k){
                return i;
            }
        }

        return -1;
    }
}