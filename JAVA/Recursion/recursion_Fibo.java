
package Recursion;
// public class recursion_Fibo {

//     static void printFibo(int a,int b,int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         printFibo(b, c, n-1); //a==b. b==c 
//     }
//     public static void main(String[] args) {
//         int a=0,b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printFibo(a, b, n);

//     }

// }

public class recursion_Fibo {
    static int fibo(int n) {
        if (n == 0 || n == 1)/// base case
            return n;

        int previous = fibo(n - 1);
        int previousPrev = fibo(n - 2);

        return previous + previousPrev;

    }

    public static void main(String[] args) {

        System.out.println(fibo(6));

    }
}