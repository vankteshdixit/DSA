package Graph;

import java.util.ArrayList;

public class BellmanFordAgorithm {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
    public static void bellmenFord(ArrayList<Edge> graph[], int src, int V){
        int dist[] = new int[V];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int k=0; k<V-1; k++){ //T.C->O(V)
            for(int i=0; i<V; i++){ // baaki is dono i aur j ke loop ko mila kar T.C->O(E)
                for(int j=0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.weight < dist[v]){
                        dist[v] = dist[u]+e.weight;
                    }
                }
            }
        }
        for (int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];
        bellmenFord(graph,0,V);
    }
}