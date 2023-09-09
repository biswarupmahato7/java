
//STAIRS PROBLEM  LINK - https://leetcode.com/problems/climbing-stairs/

package Accenture;

import java.util.Scanner;

public class ac_Q13 {
    static int noOfways(int n,int dp[]){
        if(n==1 || n==0) return 1;

        if(dp[n]!=-1) return dp[n];

        int prev=noOfways(n-1,dp);
        int preevPrev=noOfways(n-2,dp);
        
        return dp[n]=preevPrev+prev;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter no stairs: ");
         int n=sc.nextInt();
         int dp[]=new int[n+1];

         for(int i=0;i<=n;i++){
            dp[i]=-1;
         }
         System.out.println("Total number of way to reach in top= "+noOfways(n,dp));
         

    }
    
}
