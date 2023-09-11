package org.example;

public class Dog extends Animal{
    private String furColor;
    Dog(String n,String f){
        super(n);
        furColor = f;
    }
    public void enjoy(){
        System.out.println("小狗叫声...");
    }
}

