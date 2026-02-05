class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> reslist = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>(),reslist);
        return reslist;

    }
    private void backtrack(int start,int[] nums,List<Integer> temp , List<List<Integer>> reslist){
        reslist.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backtrack(i+1,nums,temp,reslist);
            temp.remove(temp.size()-1);
// reslist.remove()

        }
        
    }
}