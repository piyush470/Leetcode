class Solution {
    public int addDigits(int num) {
      if(num<10){
            return num;
        }
        int temp=num;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(sum<10){
            return sum;
        }
        else{
            return addDigits(sum);
        }
    }
}