class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right+1];
        for(int i=2;i<=right;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<=right;i++){
            if(prime[i]){
                for(int j=i*i;j<=right;j+=i){
                    prime[j]=false;
                }
            }
        }
        int prev=-1;
        int first=-1;
        int second=-1;
        int maxdiff = Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(prime[i]){
                if(prev!=-1){
                    int diff = i-prev;
                    if(diff<maxdiff){
                        maxdiff=diff;
                        first = prev;
                        second=i;
                    }
                }
                prev=i;
            }
        }
        return new int[]{first,second};
    }
}