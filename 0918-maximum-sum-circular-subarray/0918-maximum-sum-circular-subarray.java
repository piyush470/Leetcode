class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        int curmin = nums[0];
        int minsum = nums[0];
        int total_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
            if (i > 0) {
                currSum = Math.max(nums[i], currSum + nums[i]);
                maxSum = Math.max(maxSum, currSum);

                curmin = Math.min(nums[i], curmin + nums[i]);
                minsum = Math.min(curmin, minsum);
            }
        }
        if(maxSum<0){
            return maxSum;
        }
        int result = Math.max( maxSum , total_sum-minsum);
        return result;
    }
}