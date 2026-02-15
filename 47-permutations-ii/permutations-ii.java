class Solution {
    private void unique(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] visited){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
          if(visited[i])continue;
          if(i>0&&nums[i]==nums[i-1]&&!visited[i-1])continue;
          visited[i]=true;
          ds.add(nums[i]);
          unique(nums,ds,ans,visited);
          ds.remove(ds.size()-1);
          visited[i]=false;


        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        unique(nums,ds,ans,visited);
        return ans;
    }
}