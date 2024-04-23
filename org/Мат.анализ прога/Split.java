package org.example;

public class Split {
    private double a;
    private double b;
    private double n;
    private Read reader = new Read();
    public Split(Double a, Double b,Double n) {
        this.a=a;
        this.b=b;
        this.n=n;
    }


    public Double spliter(){
        while (a>b){
            System.out.println( "Введите нормальный промежуток");
            a=reader.read("a");
            b=reader.read("b");
        }
        while ((b-a)>=n){
            System.out.println("Значение n должно быть больше, чем "+(((Number) (b-a)).toString()));
            n=reader.read("n");
        }
        return (b-a)/n;
    }
}
