class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        int curmin = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                if (nums[i] < 0) {
                    int temp = currSum;
                    currSum = curmin;
                    curmin = temp;
                }
                currSum = Math.max(nums[i], currSum * nums[i]);
                maxSum = Math.max(maxSum, currSum);
                curmin = Math.min(nums[i], curmin * nums[i]);
            }
        }
        return maxSum;
    }
}