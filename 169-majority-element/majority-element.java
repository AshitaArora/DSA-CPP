class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int key=0;
        for(int i=0;i<nums.length;i++){
            if(count==0)key=nums[i];
            if(nums[i]==key)count++;
            else count--;

        }
        return key;
    }
}