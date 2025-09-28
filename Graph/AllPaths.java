package Graph;

import java.util.ArrayList;


public class AllPaths {
    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
//        1-----3
//       /      | \
//      0       |  5 --- 6
//       \      | /
//        2-----4

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
    }
//    O(V^V) worst case
    public static void DFS(ArrayList<Edge> graph[], boolean[] vis, int curr, String Path, int target){
        if(curr == target){
            System.out.println(Path+" ");
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.destination]) {
                vis[curr] = true;
                DFS(graph, vis, e.destination, Path + e.destination, target);
                vis[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V =7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];
//        1-----3
//       /      | \
//      0       |  5 --- 6
//       \      | /
//        2-----4
        int src = 0;
        int target = 5;
        DFS(graph,vis,src,"0",target);
    }
}