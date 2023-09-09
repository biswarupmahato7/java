// Implement the following Function

// The function def ProductSmallestPair(sum, arr) accepts an integers sum and an integer array arr of size n. 
// Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and 
// return the product of element of this pair

// NOTE

// Return -1 if array is empty or if n<2
// Return 0, if no such pairs found
// All computed values lie within integer range
// Example

// Input

// sum:9

// Arr:5 2 4 3 9 7 1

// Output

// 2

package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class ac_Q4 {

    public static int ProductSmallestPair(int arr[], int sum) {
        if (arr.length < 2)
            return -1;

        Arrays.sort(arr);
        // int product=1;

        return arr[0] * arr[1];

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array  size");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of Sum");
        int sum = sc.nextInt();

        System.out.println(ProductSmallestPair(arr, sum));

    }

}
