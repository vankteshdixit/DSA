package Graph;

import java.util.ArrayList;

public class TarjanAlgo1 {
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
    }
    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis, int[] discoveryTime, int[] lowDiscoveryTime, int time, int parent){
        vis[curr] = true;
        discoveryTime[curr] = lowDiscoveryTime[curr] = ++time;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(e.dest == parent){
                continue;
            }
            else if(!vis[e.dest]){
                DFS(graph, e.dest, vis,discoveryTime,lowDiscoveryTime,time,curr);
                lowDiscoveryTime[curr] = Math.min(lowDiscoveryTime[curr], lowDiscoveryTime[e.dest]);
                if(discoveryTime[curr] < lowDiscoveryTime[e.dest]){
                    System.out.println("Bridge id " + curr + " ____ " + e.dest);
                }
            }
            else {
                lowDiscoveryTime[curr] = Math.min(lowDiscoveryTime[curr], discoveryTime[e.dest]);
            }
        }
    }
//    find Bridge in graph
    public static void getBridge(ArrayList<Edge>[] graph, int V){
        int[] discoveryTime = new int[V];
        int[] lowDiscoveryTime = new int[V];
        boolean[] vis = new boolean[V];
        int time = 0;

        for(int i=0; i<V; i++){
            if(!vis[i]){
                DFS(graph, i, vis, discoveryTime, lowDiscoveryTime, time, -1);
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getBridge(graph,V);
    }
}
