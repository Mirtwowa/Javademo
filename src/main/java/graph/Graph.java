package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private int V;

    private int E;

    private Queue<Integer>[] adj;

    public Graph(int v){
        this.V=v;
        this.E=0;
        this.adj=new Queue[v];

        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }

    public Queue<Integer> getAdj(int v) {
        return adj[v];
    }

    public int getV() {
        return V;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);

        E++;
    }


}
