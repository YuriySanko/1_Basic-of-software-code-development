package com.Basic;
import java.util.Scanner; // import scanner
public class Task16 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Input cordinates (x,y):");
        double x = k.nextDouble();//reads and assigns x value
        double y = k.nextDouble();//reads and assigns y value
        if ((x>=-2)&(x<=2)&(y>=0)&(y<=4))  System.out.println("true");
            else if ((x>=-4)&(x<=4)&(y<=0)&(y>=-3)) System.out.println("true");
                 else System.out.println("false");


    }
}
