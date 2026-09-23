class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;

    }

    private void backtrack(int index, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() >= 2) {
            ans.add(new ArrayList<>(list));
        }

        if (index == nums.length)
            return;

        HashSet<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (!list.isEmpty() && nums[i] < list.get(list.size() - 1))
                continue;
            if (set.contains(nums[i]))
                continue;
            set.add(nums[i]);
            list.add(nums[i]);
            backtrack(i + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }

    }
}