package com.Basic;
import java.util.Scanner; // import scanner
public class Task35 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value e:");
        double e= k.nextDouble();//reads and assigns e
        System.out.println("Input number of row members n:");
        int n= k.nextInt();//reads and assigns n
        double sum=0;
        int i=1;
        while (i<=n){
            double row=Math.abs(1/Math.pow(2,i)+1/Math.pow(3,i));
            if (row>=e) sum+=row;
            i++;
        }
        System.out.println("Sum:"+sum);

    }
}
