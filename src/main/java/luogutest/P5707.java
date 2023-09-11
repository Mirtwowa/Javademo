package luogutest;


import java.util.Scanner;

public class P5707 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        int v = input.nextInt();
        int time = distance / v+10;
        float time2 = (float) distance / v+10;
        if (time != time2) {
            time = time + 1;
        }
        int min = time % 60;
        int hor = time / 60;
        int minute = 60-min;
        int hour =0;
        if (min==0){
            minute = 0;
            hour=8-hor;

        }

        if (min > 0) {
            hor += 1;
            if (hor >= 8) {
                hour = 32 - hor;
            } else {
                hour = 8 - hor;
            }

        }
        if(hour==24){
            if (minute<10){
                System.out.println("00"+":"+"0"+minute);
            }
            System.out.println("00"+":"+minute);
        }
         else {
             if(hour<10){

            if (hour < 10 && minute < 10) {
                System.out.println("0" + hour + ":" + "0" + minute);
            } else if (hour < 10) {
                System.out.println("0" + hour + ":" + minute);
            } else if (minute < 10) {
                System.out.println(hour + ":" + "0" + minute);
            }
             }
             else if (hour>=10) {
                 if (hour >= 10 && minute < 10) {
                     System.out.println( hour + ":" + "0" + minute);
                 } else if (hour >=10) {
                     System.out.println( hour + ":" + minute);
                 } else if (minute < 10) {
                     System.out.println(hour + ":" + "0" + minute);
                 }
             }
        }
    }
}
