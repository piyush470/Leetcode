class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        if(n<3){
            return 0;
        }
        int count=0;
        for (int i=0;i<=n-3;i++){
            int x=s.charAt(i);
            int y=s.charAt(i+1);
            int z=s.charAt(i+2);
            if(x!=y && x!=z && y!=z){
                count++;
            }
        }
        return count;
    }
}