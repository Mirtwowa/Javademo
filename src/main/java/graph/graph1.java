package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class graph1 {
    //集合
    private ArrayList<String> al;
    //二维矩阵
    private int[][] array;
    //标记
    private boolean[] is;
    //边的个数
    private int num;

    public graph1(int num) {
        this.al = new ArrayList(num);
        this.array = new int[num][num];
        this.num = 0;
        this.is = new boolean[num];
    }
    //初始化结点
    public void creatAl(String[] string) {
        for(String s:string) {
            this.al.add(s);
        }
    }
    //初始化矩阵
    public void creatArr(int x, int y) {
        this.array[x][y] = 1;
        this.array[y][x] = 1;
        num++;
    }
    //打印矩阵
    public void printArr() {
        for(int[] i:array) {
            System.out.println(Arrays.toString(i));
        }
    }

    //访问第一个结点
    public int firstNode(int index) {
        for(int i = index; i < al.size(); i++) {
            if(array[index][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    //访问下一个结点
    public int nextNode(int x, int y) {
        for(int i = y + 1; i < al.size(); i++) {
            if(array[x][i] > 0) {
                return i;
            }
        }
        return -1;
    }
    //孤立结点
    public void dfs() {
        for(int i = 0; i < al.size(); i++) {
            if(!is[i]) {
                dfs(is, i);
            }
        }
    }

    public void dfs(boolean[] b, int i) {
        System.out.print(al.get(i));
        is[i] = true;

        int w = firstNode(i);
        while(w != -1) {
            if(!is[i]) {
                dfs(b,w);
            }
            w = nextNode(i,w);
        }
    }




    //广度
    public void bfs(boolean[] b,int i) {

        System.out.print(al.get(i));
        b[i] = true;
        //队列取头结点
        int u;
        //第一个领结点
        int w;
        LinkedList queue = new LinkedList();
        queue.addLast(i);

        while(!queue.isEmpty()) {
            u = (int) queue.removeFirst();
            w = firstNode(u);

            while(w != -1) {
                if(!is[w]) {
                    System.out.print(al.get(w));
                    is[w] = true;
                    queue.addLast(w);
                }
                w = nextNode(u,w);
            }
        }
    }
    public void bfs() {
        for(int i = 0; i < al.size(); i++) {
            if(!is[i]) {
                bfs(is,i);
            }
        }
    }}


