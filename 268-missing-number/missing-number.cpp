class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        long long expectedsum= (long long) (n*(n+1))/2;
        long long actualsum=0;
        for(int i=0;i<n;i++){
            actualsum+=nums[i];
        }
        return (int)expectedsum-actualsum;
    }
};