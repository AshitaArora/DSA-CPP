class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int place = 1;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            if(digit!=0){
                x+= digit * place;
                place*=10;
                sum+=digit;
            }
            n=n/10;
        }
        return 1L*x*sum;
    }
}