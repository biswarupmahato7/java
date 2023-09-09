// The string should be compressed such that consecutive
// duplicates of characters are replaced with the character
// and followed by the number of consecutive duplicates.

// I/P-aaabbbbcce

// Output - a3b4c2e

package String;

import java.util.*;

public class string_Q4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        String ans=""+str.charAt(0);
        int count=1;

        for(int i=1;i<str.length();i++){
            char current =str.charAt(i);
            char previous =str.charAt(i-1);
            if(current==previous){
                count++;
            }else{
                if(count>1) ans+=count;

                count=1;  //For next Character
                ans+=current;
            }

        }
        if(count>1) ans+=count;

        System.out.println(ans);

    }

}


// import java.util.Scanner;

// public class string_Q4 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String");
//         String str = sc.nextLine();
//         String ans = "" + str.charAt(0);
//         int count = 1;

//         for (int i = 1; i < str.length(); i++) {
//             char current = str.charAt(i);
//             char previous = str.charAt(i - 1);
//             if (current == previous) {
//                 count++;
//             } else {
//                 if (count > 1) {
//                     ans += count;
//                 } else {
//                     ans += "-1";
//                 }
//                 count = 1;  // For the next Character
//                 ans += current;
//             }
//         }

//         // Handle the last character separately
//         if (count > 1) {
//             ans += count;
//         } else {
//             ans += "-1";
//         }

//         System.out.println(ans);
//     }
// }


