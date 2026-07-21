class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen = 0;
        int presum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)presum--;
            if(nums[i]==1)presum++;
            if(map.containsKey(presum)){
                maxlen = Math.max(maxlen,i-map.get(presum));
            }
            else
            map.put(presum,i);
        }
        return maxlen;
        

    }
}