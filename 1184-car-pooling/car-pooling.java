class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] difference = new int[1001];
        for(int i=0;i<trips.length;i++){
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            difference[from]+=passengers;
            difference[to]-=passengers;

        }
        int count=0;
        for(int i=0;i<=1000;i++){
            count+=difference[i];
            if(count>capacity){
                return false;
            }
        }
        return true;
    }
}