class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int total =0;int index =0;
        int[] count = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                total++;
            }
            else if(nums[i]==0&&total>0){
               
                count[index]=total;
                index++;
                total=0;
            }
        }
        count[index] = total;

        Arrays.sort(count);

        return count[count.length - 1];
    }
}