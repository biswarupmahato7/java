// fiend the Sqrt of given non negative value x , Round it off the nearest floor integer value
// input-x=4 O/p- 2; input -24,O/P- 4;

package Search;

import java.util.Scanner;

public class fiend_sqrt {
   static int fiendSqrt(int x) {
      int st = 0;
      int end = x;

      int ans = -1;

      while (st <= end) {
         int mid = st + (end - st) / 2;
         int val = mid * mid; // we can use long here to avoid overflow
         if (val == x) {
            return mid;
         } else if (val < x) {
            st = mid + 1;
            ans = mid;
         } else
            end = mid - 1;

      }
      return ans;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of X: ");
      int x = sc.nextInt();
      System.out.println(fiendSqrt(x));

   }

}

// import java.util.*;
// class fiend_sqrt {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int x=sc.nextInt();
// int result=0;
// for(int i=1;i<x;i++){
// if(x/(i*i)<=0){
// result=i-1;
// break;
// }
// }
// System.out.print(result);
// }
// }
//bipul