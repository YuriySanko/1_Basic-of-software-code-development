package Basics;

import java.util.Scanner; // import scanner

public class Task15
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Input time in seconds:");
        int T = k.nextInt();//reads and assigns T value
        int  hh, mm, ss;
            hh=Math.round(T/3600);
            mm=Math.round(T-hh*3600)/60;
            ss=Math.round(T-hh*3600-mm*60);
                System.out.println(hh+"ч " + mm+"мин "+ss+"сек");
    }
}
