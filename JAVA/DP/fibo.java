package DP;

import java.util.Scanner;

public class fibo {
    static int fibo(int n,int dp[]){
        
        if(n==1 || n==0 ) return 1;

        if(dp[n]!=-1) return dp[n];

        // int result=fibo(n-1,dp)+fibo(n-2,dp);
        // dp[n]=result;
        // return result;

        return dp[n]=fibo(n-1, dp)+ fibo(n-2, dp);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int dp[]=new int[num+1];
        for(int i=0;i<=num;i++){
            dp[i]=-1;
        }

        System.out.println("Fibonacci is: "+fibo(num, dp));

    }
    
}
