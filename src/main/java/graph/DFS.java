package graph;

public class DFS {
    private boolean[] marked;
    private int count;

    public int getCount() {
        return count;
    }

    public DFS(Graph G, int s){
        this.marked=new boolean[G.getV()];
        this.count=-1;
        dfs(G,s);
    }
    private void dfs(Graph G,int v){
        marked[v]=true;
        for(Integer w:G.getAdj(v)){
            if(!marked[w]){
                dfs( G, w);
            }
        }
        count++;

    }

    public boolean marked(int w){
        return marked[w];
    }

    public int count(){
        return count;
    }
}


