class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int firs=0;
        int sec=0;
        int windsum=0;
        int minlength=Integer.MAX_VALUE;
        for(sec=0;sec<nums.length;sec++){ //expand
            windsum+=nums[sec];
            while(windsum>=target){
                windsum-=nums[firs];
                minlength=Math.min(minlength,(sec-firs)+1);
                firs++;
            }  
        }
        return minlength==Integer.MAX_VALUE ? 0: minlength;
    }
}