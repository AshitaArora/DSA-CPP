class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
        return 0;
        int num=x;int rem; long long ans=0;
        while(num){
            rem=num%10;
            num/=10;
            ans=ans*10+rem;
        };
        if(ans==x)
        return true;
        else
        return false;
    }
};