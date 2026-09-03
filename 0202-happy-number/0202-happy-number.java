class Solution {
    public static int getNum(int n){
        int temp=n;
        int square=0;
        while(temp!=0){
            int lastdigit=temp%10;
            square+=lastdigit*lastdigit;
            temp=temp/10;

        }
        System.out.println(square);
        return square;
    }
    public boolean isHappy(int n) {
           int slow=n;
        int fast =n;
        while(true){
            slow=getNum(slow);
            fast=getNum(getNum(fast));
        if(fast==1){
            return true;
        }
        if(fast==slow){
            return false;
        }
    }
    }
}