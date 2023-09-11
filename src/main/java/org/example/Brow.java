package org.example;

public class Brow {
    public void brow(int index) throws NoBookExceptiopn {
        if(index>25) {
            throw new  NoBookExceptiopn("无此书");
        }
    }
    }

