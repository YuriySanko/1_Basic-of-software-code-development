package com.Basic;
import java.util.Scanner; // import scanner
public class task21 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value of corners A and B in degree:");
        int A = k.nextInt();//reads and assigns A value corner
        int B = k.nextInt();//reads and assigns B value corner
        if (((A + B) < 180)&(A!=0)&(B!=0)) {
            System.out.println("triangle exists");
            if (((A+B) == 90) || (A == 90 | B == 90)) System.out.println("triangle is rectangular");
            else System.out.println("triangle isn't rectangular");
        } else System.out.println("triangle doesn't exist");


    }
}
