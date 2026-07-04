class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low;i<=high;i++){
            int n=0;
            int temp=i;
            while(temp!=0){
                n++;
                temp=temp/10;
            }
            if(n%2==0){
                int divi=1;
                for(int j=1;j<=n/2;j++){
                    divi=divi*10;
                }
                int firshlf=i/divi;
                int secondhlf=i%divi;
                int sumfirs=0;
                int sumsec=0;
                int temp1=firshlf;
                int temp2=secondhlf;
                while(temp1!=0){
                    int lstdigit1=temp1%10;
                    sumfirs+=lstdigit1;
                    temp1=temp1/10;
                }
                while(temp2!=0){
                    int lstdigit2=temp2%10;
                    sumsec+=lstdigit2;
                    temp2=temp2/10;
                }
                if(sumfirs==sumsec){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}