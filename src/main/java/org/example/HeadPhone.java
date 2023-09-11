package org.example;

interface  HeadPhone {
double area(double b);
}
class square implements HeadPhone{
    @Override
    public double area(double  b){
        return b*b;
    }
}
