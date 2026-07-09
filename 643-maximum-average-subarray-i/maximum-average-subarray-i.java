class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int average = Integer.MIN_VALUE;
        while(j<n){
            sum+=nums[j];
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                average = Math.max(average,sum);
              
                sum-=nums[i];
                i++;j++;
            }
        }
        return (double)average/k;
    }
}