class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        int [] visited = new int [n];
        for(int i = 0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int []edge: edges){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(source);
        while(!qu.isEmpty()){
            int curr = qu.poll();
            if(curr == destination){
                return true;
            }
            if(visited[curr] == 0){
                visited[curr] = 1;
                for(int nei:adjList.get(curr)){
                    if(visited[nei] == 0){
                        qu.offer(nei);
                    }
                }
            }
        }
        return false;
    }
}