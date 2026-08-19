class Solution {
    public int jump(int[] nums) {
        int jumpcount=0;
        int maxreach=0;
        int currentreach=0;
        for(int i=0;i<nums.length-1;i++){
            maxreach = Math.max(maxreach,i+nums[i]);
            if(i==currentreach){
                jumpcount++;
                currentreach=maxreach;
                
            }
        }
            return jumpcount;
    }
}