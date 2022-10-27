import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class MathDemo{
    double a;
    double b;

    static void add(double a,double b){
        double sum = a+b;
        System.out.println("sum = "+sum);
    }

    static void sub(double a,double b){
        double subtract = a-b;
        System.out.println("sub = "+subtract);
    }

    static void mul(double a,double b){
        double multiply = a*b;
        System.out.println("mul = "+multiply);
    }

    static void pow(double a,double b){
        double power = Math.pow(a,b);
        System.out.println("power = "+power);
    }
}

public class MathOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no. to find sum,sub,mul and power");
        double x = sc.nextInt();
        double y = sc.nextInt();
        MathDemo.add(x,y);
        MathDemo.sub(x,y);
        MathDemo.mul(x,y);
        MathDemo.pow(x,y);


    }
}
