package com.Basic;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value of segment m and n :");
        int m = k.nextInt();//reads and assigns m value
        int n = k.nextInt();//reads and assigns n value

       // finding dividers of numbers on the segment
        for (int i=m; i<=n; i++) {
            System.out.print("dividers of number "+i+"are:");
            for (int j=2; j<i; j++) {
                if ((i % j) == 0) System.out.print(j + ", ");
            }
            System.out.println();
        }
    }
}
