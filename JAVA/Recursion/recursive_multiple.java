// GIVE A NUMBER num AND A VALUE k PRINT K MULTIPLES OF NUM
// CONSIDER K>0   INPUT num= 12, k=5 \\ OUTPUT- 12,24 ,36, 48, 60
package Recursion;

import java.util.Scanner;

public class recursive_multiple{

    static void calMul(int num,int k){

        if(k==0){
           // System.out.println(num);
            return;
        }
        calMul(num, k-1); //Recursive Work
        System.out.println(num*k); // self work
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of num & k");
        int num=sc.nextInt();
        int k=sc.nextInt();
        calMul(num, k);
    }
    
}
