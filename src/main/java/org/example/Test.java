package org.example;

public class Test {
    public static void main(String[] args){
        Mouse m = new Mouse("mousename","gray");
        Dog d = new Dog("dogname","yelllow");
        Magple g = new Magple();
        Lady l1 = new  Lady("josh",m);
        Lady l2 = new  Lady("vie",d);
        Lady l3 = new  Lady("te",g);
        l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}

