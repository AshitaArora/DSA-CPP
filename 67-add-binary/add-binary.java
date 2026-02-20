class Solution {
    public String addBinary(String a, String b) {
        String ans ="";
        int i = a.length()-1;int j=b.length()-1;
        int carry=0;


        while(i>=0||j>=0||carry!=0){
            int bit1 =0;int bit2=0;
            if(i>=0){
                bit1 = a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                bit2=b.charAt(j)-'0';
                j--;
            }
            int sum = bit1+bit2+carry;
            if(sum==0){
                ans = "0"+ans;
                carry=0;
            }
            else if(sum==1){
                ans = "1"+ans;
                carry=0;
            }
            else if(sum==2){
                ans="0"+ans;
                carry=1;
            }
            else{
                ans = "1"+ans;
                carry=1;
            }
        }
        return ans;
    }
}