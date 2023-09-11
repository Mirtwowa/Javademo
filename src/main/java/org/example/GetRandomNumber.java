package org.example;

import java.util.Random;
import java.util.Vector;
public class GetRandomNumber {
    public static int [] getRandomNumber(int max,int amount){
        Vector<Integer> vector = new Vector<>();
        for(int i=0;i<=max;i++){
            vector.add(i);
        }
        int result[] = new int[amount];
        while(amount>0){
            //获取随机数并存储，依次做递减操作
            int index = new Random().nextInt(vector.size());
            int m = vector.elementAt(index);
            result[amount-1] = m;
            amount--;
        }
        return result;
    }
}