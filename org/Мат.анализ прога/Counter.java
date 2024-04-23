package org.example;

public class Counter {
    static int count=0;
    public static void setCount(double delta,double  a,double b){
        count=0;
        double length =b-a;
        while (length>0){
            length -= delta;
            count+=1;
        }

    }
}
