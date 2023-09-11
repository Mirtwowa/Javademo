package org.example;

public class Text {
    public static void main(String[] args){
       String s1 ="A";
        String s2 ="b";
        show(s1,s2);
        System.out.println(s1+s2);
        Integer s6 = Integer.valueOf(s1);
        System.out.println(s6);
    }
    public static void show(String s1,String s2){
        s1=s1+22;
        s2=s1+s2;
        System.out.println(s1+s2);
    }
}