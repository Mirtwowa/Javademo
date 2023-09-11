package luogutest;

import java.util.Scanner;

public class P2029 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int h=input.nextInt();
        int r=input.nextInt();
        double v= 3.14*r*r*h;
        int num = (int) ((int) 20000/v);
        double num2 =20000/v;
        if(num!=num2){
            num+=1;
        }

        System.out.println(num);
    }
}
