package Accenture;

// Problem Statement 1: (Difficulty Level- Easy)

// Implement the following function:
// int AddDiustinctSubDuplicate (int a, int b, int c, int d);
// The function accepts 4 integers a, b, c & d as its argument. Implement the function to find the sum of distinct numbers and subtract the duplicate number.
// (Sum of distinct numbers – duplicate number)
// •	For sum of distinct numbers add all numbers that appears only once.
// •	For duplicate number, subtract the duplicate number only once.
// Example 1:  
// Input:
// a: 5
// b: 4
// c: 4
// d: 9

// Output 
// 10

import java.util.Scanner;
public class ac_Q6{

  static int AddDiustinctSubDuplicate(int a, int b, int c, int d) {
    int sumDistinct = 0;
    int duplicate = 0;

    int[] arr = {a, b, c, d};

    for (int i = 0; i < arr.length; i++) {
        boolean isDuplicate = false;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                isDuplicate = true;
                break;
            }
        }
        
        if (isDuplicate) {
            duplicate = arr[i];
            break;  
        }
    }

    for (int num : arr) {
        if (num != duplicate) {
            sumDistinct += num;
        }
    }

    return sumDistinct - duplicate;
}

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of four integers: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    System.out.println(AddDiustinctSubDuplicate(a, b, c, d));

    
  }
}