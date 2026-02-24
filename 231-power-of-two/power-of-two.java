class Solution {
    public boolean isPowerOfTwo(int n) {
        int a = n-1;
        if(n==0||n<0) return false;

        if((a&n)==0){
            return true;
        }
        return false;
    }
}