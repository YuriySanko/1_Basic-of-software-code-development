package Basics;
import java.util.Scanner; // import scanner

public class Task23 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input value of coordinate point A:");
        //reads and assigns coordinate point A;
        double x1= k.nextDouble();
        double y1 = k.nextDouble();
        System.out.println("Input value of coordinate point B:");
        //reads and assigns coordinate point B;
        double x2= k.nextDouble();
        double y2 = k.nextDouble();
        System.out.println("Input value of coordinate point C:");
        //reads and assigns coordinate point C;
        double x3= k.nextDouble();
        double y3 = k.nextDouble();
        if ((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)==0) System.out.println("Points lies on the line");
            else System.out.println("Points doesn't lie on the line");
    }
}
