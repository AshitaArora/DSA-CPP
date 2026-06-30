class Solution {
    public boolean isGoodArray(int[] nums) {
        //if gcd of all the numbers is 1 then there will definetly be some numbers jinka multiplication ka sum 1 aaega so in this ques we just have to check gcd if thats one then its a good array
        int gcd = nums[0];
        for(int i=1;i<nums.length;i++){
             gcd = findgcd(gcd,nums[i]);
        }
        return gcd==1;}
        private int findgcd(int a, int b) {
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;

        }
        return a;
        }
       

    
}