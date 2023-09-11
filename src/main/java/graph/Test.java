package graph;

public class Test {
    public static void main(String[] args){
        String[] string = {"A","B","C","D","E"};
        boolean b[] = new boolean[0];
        int i=1;
        graph1 g = new graph1(5);
        g.creatAl(string);
        g.creatArr(0, 1);
        g.creatArr(0, 2);
        g.creatArr(1, 3);
        g.creatArr(2, 3);
        g.creatArr(3, 4);

        g.printArr();
//		g.index();
        g.bfs();
        g.dfs();
        System.out.println();
        g.dfs(b,i);

    }
}
