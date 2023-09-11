package org.example;


import java.util.Scanner;


public class Test1 {
   static class Cricle{

        int x1,y1,r;
        public Cricle(int x,int y,int r){
            this.x1=x;
            this.y1=y;
            this.r=r;
        }
       void show(){
           System.out.println("圆的圆心x1:"+x1);
           System.out.println("圆的圆心y2:"+y1);
           System.out.println("圆的半径r:"+r);
       }
         public void judgement(Point a,Cricle b){
          if(((a.x-b.x1)*(a.x-b.x1)+(a.y-b.y1)*(a.y-b.y1))<=(b.r*b.r)){
              System.out.println("点在圆内");
          }
          else {
              System.out.println("点不在圆内");
          }
       }
    }
    static class Point{

       int x,y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
        public void show(){
            System.out.println("点的坐标x："+x);
            System.out.println("点的坐标y："+y);
        }

    }
    public static void main(String[] args)
    {
        Scanner IN =new Scanner(System.in);
        System.out.println("请输入圆心坐标");
        Cricle cricle1= new Cricle(IN.nextInt(), IN.nextInt(), IN.nextInt());
        System.out.println("请输入点的坐标");
        Point point1=new Point(IN.nextInt(), IN.nextInt());
        cricle1.show();
        cricle1.judgement(point1, cricle1);
        point1.show();
    }
}
