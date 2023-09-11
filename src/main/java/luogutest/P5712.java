package luogutest;

import java.util.Scanner;

public class P5712 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int apple =input.nextInt();
        if (apple==1){
            System.out.println("Today, I ate 1 apple.");
        }else if(apple>1&&apple<=100){
            System.out.println("Today, I ate " + apple+" apples.");
        } else if (apple==0) {
            System.out.println("Today, I ate 0 apple.");
        }
    }
}
