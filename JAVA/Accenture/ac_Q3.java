// You are required to implement the following Function def LargeSmallSum(arr). 

// The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest
//  largest element from the even positions and second smallest from the odd position of given ‘arr’.
//  Example:-

// Input

// arr:3 2 1 7 5 4

// Output

// 7

// Explanation

// Second largest among even position elements(1 3 5) is 3
// Second largest among odd position element is 4
// Thus output is 3+4 = 7

package Accenture;

import java.util.Scanner;
 import java.util.Arrays;

public class ac_Q3 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int LargeSmallSum(int arr[]) {
        int n = arr.length;

        int evenIndexArray[] = new int[n];
        int oddIndexArray[] = new int[n];
        for (int i = 0; i < n ; i++) {
            if (i % 2 == 0) {
                evenIndexArray[i] = arr[i];
            } else {
                oddIndexArray[i] = arr[i];

            }

        }
        Arrays.sort(evenIndexArray);
        printArray(evenIndexArray);
        Arrays.sort(oddIndexArray);
        printArray(oddIndexArray);

        return (evenIndexArray[evenIndexArray.length - 2] + oddIndexArray[oddIndexArray.length - 2]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[size];
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(LargeSmallSum(arr));

    }

}



