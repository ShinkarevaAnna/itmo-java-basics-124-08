package Itmo.lessonOverloadConstructors;
//нужно ли объявлять переменные и потом в методе присваивать передаваемые параметры через this?
public class Calculator {
    public double sum(double a, double b){
        return a+b;
    }
    public int sum(int c, int d){
        return c+d;
    }
    public long sum(long e, long f){
        return e+f;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double division(int c, int d){
        return (double) c/d;
    }


    public double division(long e, long f){
        return (double) e/f;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public int multiplication(int c, int d){
        return c*d;
    }
    public long multiplication(long e, long f){
        return e*f;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public int subtraction(int c, int d){
        return c-d;
    }
    public long subtraction(long e, long f){
        return e-f;
    }
}
