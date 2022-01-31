package com.Basic;
import java.util.Scanner; // import scanner
public class task32 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value a and B and steep h:");
        int a= k.nextInt();//reads and assigns a
        int b = k.nextInt();//reads and assigns b
        int h = k.nextInt();//reads and assigns h
        int x;
        if (a<b)
            {
                for (x = a; x <= b; x += h) {
                    if (x > 2) System.out.println(x + "; ");
                    else System.out.println((-1 * x) + "; ");
                }
            }
            else  {for (x=a;x>=b;x-=h){
                if (x>2) System.out.println(x+"; "); else System.out.println((-1*x)+"; ");
            }
        }
    }
}
