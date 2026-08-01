class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longestlength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentLength=1;
                while(set.contains(currentNum+1)){
                    currentLength++;
                    currentNum++;
                }
                longestlength=Math.max(currentLength, longestlength);
            }
        }
        return longestlength;
    }
}