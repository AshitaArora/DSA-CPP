class Solution {
    private void unique(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] visited){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]){
                continue;
            }
          if(!visited[i]){
            ds.add(nums[i]);
            visited[i]=true;
            unique(nums,ds,ans,visited);
            visited[i]=false;
            ds.remove(ds.size()-1);
          }


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