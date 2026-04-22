class Solution {
    public int arrayPairSum(int[] nums) {
        //hume only maximum sum nhi, minimums ka maximum sum dekhna h to hum minimums ka sum sabse pehle krege.
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}