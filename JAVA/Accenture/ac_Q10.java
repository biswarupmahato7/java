package Accenture;

import java.util.*;

public class ac_Q10 {
    static int isPerfectSqr(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(Math.ceil(Math.sqrt(arr[i]))==Math.floor(Math.sqrt(arr[i]))){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();

        System.out.println("Emter array elements");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Selected area are: ");
        System.out.println(isPerfectSqr(arr));

    }
    
}


// double number = 7.3;
// double ceilResult = Math.ceil(number); // Returns 8.0


// double number = 7.8;
// double floorResult = Math.floor(number); // Returns 7.0
