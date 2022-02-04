package Basics;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения): (𝑏+√𝑏2+4𝑎𝑐)/2𝑎−𝑎3𝑐+𝑏−2

public class Task12
{  public static void main(String[] args){
    // definition variables
    double a=12,b=4,c=3, result;
    // checking division by zero
     if ((a!=0)&(b!=0)) {
        // print result
        result=(b+Math.sqrt(b*b+4*a*c)/(2*a)-Math.pow(a,3)*c+Math.pow(b,1/2));
        System.out.println(((b*b+4*a*c))<0? "negative root": "b+sqrt(b^2+4ac)/(2a)-a^3*c+b^1/2)="+result);
    }
     else{ System.out.println("division by zero"); }


}

}
