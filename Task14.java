package com.Basic;

import java.util.Scanner;

public class Task14
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Input value R:");
         double R = k.nextDouble();//reads and assigns x value
         double  nnn, ddd; // definition variables
         nnn=Math.round(R); // rounding R
         ddd=R-nnn;  // finding fractional part
            //System.out.println("integer part"+nnn+" fractional part"+ddd);

            R=(nnn/1000)+(ddd*1000); // changing integer and fractional parts
            R=Math.round(R*1000)/1000.0;
            System.out.println("Result "+R);
    }

}
