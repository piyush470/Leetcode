class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxave=0;
        double windsum=0;
        for(int i=0;i<k;i++){
            windsum+=nums[i];
        }
        maxave=windsum;
        for(int j=k;j<nums.length;j++){
            windsum+=nums[j];//Expand
            windsum-=nums[j-k];//Shrinking
            maxave=Math.max(maxave, windsum);
            }
        return maxave/k;
    }
}