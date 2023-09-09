package Accenture;

import java.util.Scanner;

public class ac_q15 {

    static int sumofDeg(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
        }
        return sum;
    }
    static int sumofEle(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        // int n=sc.nextInt();
        int arr[] = { 11, 14, 16, 10, 9, 8, 24, 5, 4, 3 };
        int F1 = sumofDeg(arr) %10;
        System.out.println(F1);
        int F2= sumofEle(arr) %10;
        System.out.println(F2);
        int F = F1-F2;
        System.out.println("Ans is " + F);


    }
}
