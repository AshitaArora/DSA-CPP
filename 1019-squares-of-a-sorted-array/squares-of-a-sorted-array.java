class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        
    }
}

// optimal approach
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];

//         int left = 0, right = n - 1;
//         int index = n - 1;

//         while(left <= right) {
//             if(Math.abs(nums[left]) > Math.abs(nums[right])) {
//                 result[index] = nums[left] * nums[left];
//                 left++;
//             } else {
//                 result[index] = nums[right] * nums[right];
//                 right--;
//             }
//             index--;
//         }

//         return result;
//     }
// }