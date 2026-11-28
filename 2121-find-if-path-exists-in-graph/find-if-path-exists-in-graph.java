class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] vis = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source]=1;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node==destination)return true;
            for(int i:adj.get(node)){
                if(vis[i]==0){
                    q.add(i);
                    vis[i]=1;
                }
            }
        }
        return false;
    }
}