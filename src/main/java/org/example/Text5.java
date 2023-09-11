package org.example;

public class Text5 {
    public static void main(String[] args)  {
        try {
            Brow br =new Brow();
            br.brow(26);
        }
        catch (NoBookExceptiopn e){
            System.out.println( e.getMessage());
        }
    }
}
