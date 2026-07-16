class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int count = 0;
        int ans = 0;
        while(j<nums.length){
            if(nums[j]==1)count++;
            if(j-i+1-count <= k){
                ans = Math.max(ans,j-i+1);
                j++;
            }
            else{
                if(nums[i]==1)count--;
                i++;j++;
            }
        }
        return ans;
        
    }
}