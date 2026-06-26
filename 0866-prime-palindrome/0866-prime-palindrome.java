class Solution {
    public boolean isprime(int n){
        boolean prime=true;
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        }
        return prime;
    }
    public boolean ispallindrome(int n){
       
            int og=n;
            int rev=0;
            int temp=n;
            while(temp!=0){
                int lstdigit=temp%10;
                rev=rev*10+lstdigit;
                temp=temp/10;
            }
            return og==rev;
        
    }
    public int primePalindrome(int n) { 
        while(true){
            if(n>10000000  && n< 100000000){
                n=100000000;
            }
            if(isprime(n) && ispallindrome(n)){
                return n;
            }
            n++;
        }
    }
}