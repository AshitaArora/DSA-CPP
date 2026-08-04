class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
            set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}