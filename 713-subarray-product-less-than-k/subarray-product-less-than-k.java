class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n= nums.length;
        int count=0;
        int s=0;
        int e=0;
        int product =1;
        if(k<=1) return 0;
        for(s=0;s<n;s++){
            product *= nums[s];
            while(product>=k){
                product /= nums[e];
                e++;
            }
            count += s-e+1;
        }
return count;
    }
}