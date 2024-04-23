package org.example;

public class Rectangle {

    public Rectangle() {

    }
    public double sum_rectangle(double delta,double  a,double b){
        double length =b-a;
        double sum=0;
        double degree=0;
        while (length>0){
            if (length-delta<0){
                degree += length;
                sum+=(length*(Math.pow(3,degree)));
                length=0;
            }else {
                degree += delta;
                length -= delta;
                sum+= (delta*(Math.pow(3,degree)));

            }

        }
        return sum;

    }
}
