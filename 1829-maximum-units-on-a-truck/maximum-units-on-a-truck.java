class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans=0;
        for(int[] box : boxTypes){
           int boxes = Math.min(box[0],truckSize);
            ans+=box[1]*boxes;
            truckSize-=boxes;
            if(truckSize==0)break;
        }
        return ans;
    }
}