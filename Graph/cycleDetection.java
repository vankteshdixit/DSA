package Graph;

import java.util.ArrayList;

public class cycleDetection {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));

        graph[2].add(new Edge(2,1));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
    }

    public static boolean isCycleDirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] rec){
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!vis[e.dest]){
                if(isCycleDirected(graph,vis,e.dest,rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                boolean isCycle = isCycleDirected(graph,vis,i,rec);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
