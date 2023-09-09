package Opps;

import java.util.function.Function;

public class fraction {

    public static Fraction add(Fraction f1,Fraction f2){
        int num=f1.numerator*f2.denominator+ f1.denominator*f2.numerator;
        int den=f1.denominator*f2.denominator;
        Fraction f3=new Fraction(num,den);
        return f3;

    }

    public static int gcd(int numerator,int denominator){
        int min=Math.min(numerator,denominator);
        for(int i=min;i>=1;i--){
            if(numerator%i==0 && denominator%i==0) return i;


        }
        return min;
    }

    public static class Fraction{
        int numerator;
        int denominator;

        public Fraction(int num,int den){
            numerator=num;
            denominator=den;
            Simplify();

        }

        public  void Simplify(){
           int hcf=gcd(numerator,denominator);
           numerator/=hcf;
           denominator/=hcf;

        }
    }


    public static void main(String[] args) {
        Fraction f1=new Fraction(7, 21);
        //f1.Simplify();
        System.out.println(f1.numerator+"/"+f1.denominator);
        Fraction f2=new Fraction(10, 50);
        System.out.println(f2.numerator+"/"+f2.denominator);
        Fraction f3=add(f1, f2);
        System.out.println(f3.numerator+"/"+f3.denominator);

       
       

    }
    
}
