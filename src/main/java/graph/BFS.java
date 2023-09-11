package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private boolean[] marked;
    private int connectcount;
    private Queue<Integer> nearadj;

    public int getCount() {
        return connectcount;
    }

    public BFS(Graph G, int s){
        this.marked=new boolean[G.getV()];
        this.connectcount=0;
        this.nearadj=new LinkedList<>();
        bfs(G,s);
    }

    public void bfs(Graph G,int s){
        marked[s]=true;
        nearadj.add(s);
        while (!nearadj.isEmpty()){
            Integer wait1 = nearadj.poll();
            for (Integer w:G.getAdj(wait1)){
                if (!marked[w]){
                    marked[w]=true;
                    nearadj.add(w);
                    connectcount++;
                }
            }
        }
    }
}
