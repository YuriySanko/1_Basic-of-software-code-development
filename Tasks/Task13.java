package Basics;

import static java.lang.Math.sin;


public class Task13 {
    public static void main(String[] args) {
        // definition variables in degree
        double x=40, y=45, result;

        System.out.println("x= " + x+"y="+y);
        //  convertin in radians
        x=Math.toRadians(x);
        y=Math.toRadians(y);
        // result=Math.cos(x)- Math.sin(y);
        //System.out.println("cos(x)-sin(y)="+result);
        // checking division by zero
        if (((Math.round(Math.cos(x)*100)/100.0)- (Math.round(Math.sin(y)*100)/100.0))!=0) {
            // print result
            result=(sin(x)+ sin(y))/(Math.cos(x)- Math.sin(y))*Math.tan(x*y);
            System.out.println("tg(xy)*(sin(x)+cos(y))/(cos(x)-sin(y)="+result);
        }
        else{ System.out.println("division by zero"); }


    }


}
