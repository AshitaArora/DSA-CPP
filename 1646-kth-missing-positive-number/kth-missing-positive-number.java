class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int s=0,e=n-1;
        int missing,m;
        while(s<=e){
            m = s+(e-s)/2;
            missing = arr[m]-(m+1);
            if(missing<k){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }return s+k;
        // if(e<0)return k;
        // current+total left missing elements
        // total left missing elements = k-(current element-position)
        // return arr[e]+(k-(arr[e]-(e+1)));


    }
}