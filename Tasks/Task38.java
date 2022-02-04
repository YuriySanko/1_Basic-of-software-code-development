package Basics;

import java.util.Scanner;

public class Task38 {
    // fill array by digits
    public static void fillArray(Integer[] digits, int number) {
        int i = 0;
        while (number != 0) {
            digits[i] = (number % 10);
            number /= 10;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input two integers m and n :");
        int m = k.nextInt();//reads and assigns m value
        int n = k.nextInt();//reads and assigns n value
        Integer[]numb1=new Integer[10];
        Integer[]numb2=new Integer[10];

        // transfer numbers in digits array
        fillArray(numb1,m); //
        fillArray(numb2,n);

        // transfer numbers to the string to now a count of digits
        String l1= Integer.toString(m);
        String l2= Integer.toString(n);

        // finding a same digits
        System.out.print("The same digits in numbers are: ");
        for (int i=0; i<l1.length(); i++) {
            for (int j = 0; j < l2.length(); j++) {
                if (numb1[i] == numb2[j]) System.out.print(numb1[i] + ", ");
            }
        }
    }
}
