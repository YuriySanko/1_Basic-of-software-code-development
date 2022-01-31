package com.Basic;

import java.math.BigInteger;

public class Task34 {
    public static void main(String[] args) {
        BigInteger sum=new BigInteger("1");
        for (int i=1;i<=200; i++) {sum=sum.multiply(BigInteger.valueOf(i*i)) ;}
        System.out.println("Multiplication of squares first two hundreds integers "+sum);


    }
}
