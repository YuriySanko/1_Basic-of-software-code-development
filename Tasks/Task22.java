package Basics;
import java.util.Scanner; // import scanner
public class Task22 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input four integers:");
        double a = k.nextDouble();//reads integer a;
        double b = k.nextDouble();//reads integer b;
        double c = k.nextDouble();//reads integer c;
        double d = k.nextDouble();//reads integer d;
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
