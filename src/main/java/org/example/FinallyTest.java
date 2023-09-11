package org.example;

public class FinallyTest {
    public static void main(String[] args){
    int arr[]= new int[10];
    int max,min,num2=0,num=0;
    String s1[] =new String[]{"0","1","2","3","4","5","6","7","8","9"};
    for(int i=0;i<10;i++){
        arr[i]=Integer.parseInt(s1[i]);
    }
    max=arr[0];
    min=arr[0];
        for(int i=0;i<10;i++){
            if(arr[i]>=max){
                max=arr[i];
                num=i;
            }
            if(arr[i]<=min){
                min=arr[i];
                num2=i;
            }
        }
        System.out.println(max+"&"+num);
        System.out.println(min+"&"+num2);
    }
}
