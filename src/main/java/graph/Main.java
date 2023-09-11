package graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(13);
        graph.addEdge(11,12);
        graph.addEdge(9,12);
        graph.addEdge(9,10);
        graph.addEdge(9,11);
        graph.addEdge(7,8);
        graph.addEdge(4,6);
        graph.addEdge(3,4);
        graph.addEdge(5,4);
        graph.addEdge(5,3);
        graph.addEdge(0,6);
        graph.addEdge(0,2);
        graph.addEdge(0,1);
        graph.addEdge(0,5);




        DFS Deepfirstsearch = new DFS(graph, 0);
        System.out.println(Deepfirstsearch.getCount());

        BFS Broadfirstsearch = new BFS(graph,0);
        System.out.println(Broadfirstsearch.getCount());


    }
}