class Solution {
    public int findMin(int[] nums) {
        int left=0;int right=nums.length-1;
        while(left<right){
            int mid= left+(right-left)/2;
            //nums[mid] is > mtlb chhote elements uske aage h to hum vaha minimum element dhundege
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}