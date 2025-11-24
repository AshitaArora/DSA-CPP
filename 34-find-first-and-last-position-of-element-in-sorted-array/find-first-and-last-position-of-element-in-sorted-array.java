class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;int end  = nums.length-1;int mid;int left =  -1;int right=-1;
        while(end>=start){
            mid = start+ (end-start)/2;
            if(nums[mid]==target){
                left=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
        }
        start=0;
        end  = nums.length-1;

         while(end>=start){
            mid = start+ (end-start)/2;
            if(nums[mid]==target){
               right = mid;
               start = mid +1;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
        }int[] ans = {left,right};
        return ans;
    }
}