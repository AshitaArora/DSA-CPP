class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reslist=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),reslist);
        return reslist;
    }
    private void backtrack(int ind,int[] nums,List<Integer> current,List<List<Integer>>reslist){
        reslist.add(new ArrayList<>(current));
        for(int i=ind;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(i+1,nums,current,reslist);
            current.remove(current.size()-1);
        }
    }
   
        
    
}