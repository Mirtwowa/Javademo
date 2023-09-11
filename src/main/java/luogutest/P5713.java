package luogutest;

import java.util.Scanner;

public class P5713 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a= input.nextInt();
        int b= input.nextInt();
        for (int i=a;i<b;i++){
            boolean yn=isPalindrome(i);
        }


        }
    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }

}
