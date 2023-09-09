package Recursion;
import java.util.Scanner;

// public class recursion_Gcd {
//     static int calGcd(int x, int y) {
//         while (x % y != 0) {
//             int rem = x % y;
//             x = y;
//             y = rem;
//         }
//         return y;

//     }

//     public static void main(String[] args) {
//         System.out.println("GCD is ");
//         System.out.println(calGcd(15, 24));

//     }

// }


// using Recursion

public class recursion_Gcd{
    static int calGcd(int x,int y){ //GCD
        if(y==0) return x;
         int gcd=calGcd(y, x%y);
         return gcd;
    }
    static int calLcm(int x,int y){ //LCM
        int gcd=calGcd(x, y);
        return (x*y)/gcd;
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x & y");
        int x =sc.nextInt();
        int y =sc.nextInt();
        System.out.println("Gcd is="+calGcd(x, y));
        System.out.println("Lcd is="+calLcm(x, y));
        
    }
}