package com.Basic;
import java.util.Scanner; // import scanner
public class Task24 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value of sides of rectangle A & B:");
        //reads and assigns value sides A B;
        double A= k.nextDouble();
        double B = k.nextDouble();
        System.out.println("Input value of sides of brick x,y,z:");
        //reads and assigns value of sides of brick x,y,z;
        double x= k.nextDouble();
        double y = k.nextDouble();
        double z = k.nextDouble();
        if (((A>x)&(B>y))|((A>y)&(B>x))|((A>x)&(B>z))|((A>z)&(B>x))|(((A>z)&(B>y))|((A>y)&(B>z))))
            System.out.println("The brick passes through the hole");
        else System.out.println("The brick doesn't pass through the hole");
    }
}
