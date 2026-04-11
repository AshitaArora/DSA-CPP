class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){return true;} //normal binary search condition
            //passing from duplicates
            if(nums[left]==nums[mid]&&nums[mid]==nums[right]){
                left++;
                right--;
            }
            //leftside unsorted array
            else if(nums[left]<=nums[mid]){
            if(nums[left]<=target && target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        //right unsorted array
        else {
            if(nums[mid]<target && target<=nums[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        }
        return false;
    }
}