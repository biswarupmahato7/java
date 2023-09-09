
// Question:
// You are given a positive integer N. Write a Java function called minSquares that calculates the minimum number of perfect 
// squares that need to be added up to reach the value N. Each perfect square can be used more than once if needed. For example, if N = 13, you can
//  represent it as 4 + 9 (1 square of side length 2 and 1 square of side length 3), so the minimum number of squares required is 2. 
//Your task is to implement the
//   minSquares function using either dynamic programming or a recursive approach.

package Accenture;
import java.util.*;

public class ac_Q11{
    public static int minSquares(int n){
        if(n<=0) return 0;

        int result=n; // Initialize with maximum possible value
        for(int i=1; i*i <=n;i++){
            result=Math.min(result,1+minSquares(n-i*i));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        System.out.println("Ans is = "+minSquares(N));
        
    }
}



























// Certainly! Let's walk through the recursive dynamic programming process for the input 10.

// Input: N = 10

// java
// Copy code
// public static int minSquares(int n) {
//     if (n <= 0)
//         return 0;

//     int result = n; // Initialize with maximum possible value
//     for (int i = 1; i * i <= n; i++) {
//         result = Math.min(result, 1 + minSquares(n - i * i));
//     }
//     return result;
// }
// Here's how the algorithm proceeds step by step:

// minSquares(10) is the initial call.

// The loop iterates from i = 1 to i * i <= 10 (i.e., i = 1, i = 2, i = 3). The goal is to find the minimum number of squares needed to add up to 10.

// When i = 1:

// result is updated by comparing the current result and 1 + minSquares(10 - 1 * 1).
// When i = 2:

// result is updated by comparing the current result and 1 + minSquares(10 - 2 * 2).
// minSquares(10 - 2 * 2) is equivalent to minSquares(6).
// When i = 3:

// result is updated by comparing the current result and 1 + minSquares(10 - 3 * 3).
// minSquares(10 - 3 * 3) is equivalent to minSquares(1).
// When i = 4, the loop stops because 4 * 4 is not less than or equal to 10.

// Finally, the algorithm returns the minimum count among the calculated values: result = 2.

// Output: The minimum number of squares needed to add up to 10 is 2. This is achieved by using squares 3^2 and 1^2, resulting in 9 + 1 = 10.

// So, the algorithm finds that the best combination of squares to add up to 10 is 3^2 and 1^2, requiring a minimum of 2 squares.