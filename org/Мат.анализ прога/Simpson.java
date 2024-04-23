package org.example;

public class Simpson {

    public double sum_simpson(double delta,double  a,double b){
        double length = b-a;
        double sum = 0;
        double degree = 0;

        while (length > 0){
            if (length-delta<0){
                degree += length;
                sum += (length / 6 * (Math.pow(3, degree - length) + 4 * Math.pow(3, (degree + degree - length) / 2) + Math.pow(3, degree)));
                length=0;
            }else {
                degree += delta;
                length -= delta;
                sum += (delta / 6 * (Math.pow(3, degree - delta) + 4 * Math.pow(3, (degree + degree - delta) / 2) + Math.pow(3, degree)));
            }

        }
        return sum;

    }
}
