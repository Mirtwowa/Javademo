package Exam;

import java.util.Scanner;

public class Bag01 {
    public static void main(String[] args) {
        Scanner In =new Scanner(System.in);
        int n= In.nextInt();
        int nums[][]={
                {2, 3},
                {3, 3},
                {2, 4},
                {3, 5},
                {5, 4},
                {2, 1},
                {2, 2},
        };

        int lag[]=new int[n+1];
        for (int i=0;i< nums.length;i++){
             for (int j=n;j>=nums[i][0];j--){
                 lag[j]=Math.max(lag[j],lag[j-nums[i][0]]+nums[i][1]);
             }
        }


        for (int i=0;i<=n;i++){
            System.out.println(lag[i]);
        }


    }


}
