package com.Basic;
import java.util.Scanner; // import scanner
public class task31 {
    public static void main(String[] args) {
            Scanner k = new Scanner(System.in);
            System.out.println("Input value integer");
            //reads and assigns value N;
            int N= k.nextInt();
            int sum=0;
            for (int i=1; i<=N; i++) sum+=i;
        System.out.println("Sum of integers from 1 to "+N+" equally: "+sum);


    }
}
