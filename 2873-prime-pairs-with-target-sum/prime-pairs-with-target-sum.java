class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] prime = new boolean[n+1];
        for(int i = 2 ; i < n ; i++ ){
            prime[i] = true;
        }
        for( int i = 2 ; i*i <= n ; i++){
            if(prime[i] == true){
                for( int j = i*i ; j <= n ; j = j+i){
                    prime[j] = false;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 2; i <= n/2 ; i++){
            if(prime[i]==true && prime[n-i]==true){
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(n-i);
                ans.add(pair);
            }
        }
        return ans;
    }
}