class Solution {
    public int maximumSum(int[] arr) {
        int prevDelete=0;
        int prevNotdelete=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            prevDelete=Math.max(prevNotdelete,prevDelete+arr[i]);
            prevNotdelete=Math.max(arr[i],prevNotdelete+arr[i]);
           int curr=Math.max(prevDelete,prevNotdelete);
            max=Math.max(max, curr);
        }
        return max;
    }
}