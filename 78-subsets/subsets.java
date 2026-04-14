class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reslist = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),reslist);
        return reslist;
    }
        private void backtrack(int ind,int[] nums,List<Integer> curr,List<List<Integer>> reslist){
            reslist.add(new ArrayList<>(curr));
            for(int i=ind;i<nums.length;i++){
                curr.add(nums[i]);
                backtrack(i+1,nums,curr,reslist);
                curr.remove(curr.size()-1);
            }
        
    }
}