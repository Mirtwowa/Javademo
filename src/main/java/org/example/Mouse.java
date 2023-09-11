package org.example;

public class Mouse extends Animal{
    private String eyesColor;
    Mouse(String n, String c){
        super(n);
        eyesColor = c;
    }
    public void enjoy(){
        System.out.println("老鼠叫声...");
    }
}