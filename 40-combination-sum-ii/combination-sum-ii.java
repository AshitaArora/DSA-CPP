class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int index,int[] candidates,int target,List<Integer> temp,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            temp.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}