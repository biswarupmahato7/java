//Armstrong number

package Accenture;

import java.util.Scanner;

public class ac_q14 {

    static String isArmstrong(int n){
        int temp=n;
        
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=(rem*rem*rem);
            temp/=10;
        }
        if(sum == n ) return "YES";
        else
        return "NO";
                                                                                            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        //boolean result=isArmstrong(n);

        System.out.println("isArmstrong "+ isArmstrong(n));
    }
    
}
