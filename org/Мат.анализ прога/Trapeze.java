package org.example;

public class Trapeze {
    public double sum_trapeze(double delta,double  a,double b){
        double length =b-a;
        double sum=0;
        double degree=0;
        while (length>0){
            if (length-delta<0){
                degree += length;
                sum += (length / 2 * (Math.pow(3, degree) + Math.pow(3, degree - length)));
                length=0;
            }else {
                degree += delta;
                length -= delta;
                sum += (delta / 2 * (Math.pow(3, degree) + Math.pow(3, degree - delta)));
            }
        }
        return sum;

    }
}
