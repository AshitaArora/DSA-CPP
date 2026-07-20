class Solution {
    public int subarraySum(int[] nums, int k) {
        //BRUTE FORCE APPROACH
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }return count;

        //PREFIX SUM + HASHMAP
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int presum = 0;
        for(int i = 0;i<nums.length;i++){
            presum += nums[i];
            if(map.containsKey(presum-k)){
                count+=map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}