package com.Basic;
import java.util.Scanner; // import scanner
public class Task25 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value variable x for function F(x):");
        //reads and assigns value variable x for function F(x);
        double x= k.nextDouble();
        if (x<=3) System.out.println("F(x)=x^2-3x+9 equally " + (x*x-3*x+9));
        else System.out.println("F(x)=1/(x^3+6) equally " + (1/(x*x*x+6)));

    }
}
