class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = nums.length/3;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)>n){
                ans.add(key);
            }
        }
        return ans;

    }
}