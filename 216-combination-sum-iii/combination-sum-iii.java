class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int start,int k,int target,List<Integer> temp,List<List<Integer>> ans){
        if(target==0&&temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0||temp.size()>k)return;
        for( int i = start;i<=9;i++){
            temp.add(i);
            backtrack(i+1,k,target-i,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}