package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosaRaju {
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
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }
    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st){
        vis[curr] = true;
        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,st);
            }
        }
        st.push(curr);
    }
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean[] vis){
        vis[curr] = true;
        System.out.print(curr+" ");
        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph,e.dest,vis);
            }
        }
    }
    public static void kosarajuAlgo(ArrayList<Edge>[] graph, int V){
//        Step 1
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];
        for (int i=0; i<V; i++){
            if(!vis[i]){
                topSort(graph,i,vis,st);
            }
        }
//        Step 2
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i< graph.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }
        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }
//        Step 3
        while (!st.isEmpty()){
            int curr = st.pop();
            if(!vis[curr]){
                DFS(transpose, curr, vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph,V);
    }
}