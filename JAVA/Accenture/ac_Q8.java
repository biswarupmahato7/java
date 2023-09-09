//Que- https://leetcode.com/problems/bulb-switcher/

package Accenture;

import java.util.Scanner;

public class ac_Q8 {

    public static double bulbOn(int n) {
        double d=0;
        return d=Math.sqrt(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();
        double ans=bulbOn(n);
        int noOfbulb=(int)ans;
        
        System.out.println("The number rof Bulbe is on :" + noOfbulb);

    }

}
