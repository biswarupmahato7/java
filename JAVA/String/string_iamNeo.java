// package String;

// import java.util.ArrayList;
// import java.util.Scanner;

// public class string_iamNeo {
//     public static String[] subStr(String s, int n) {
//         String result[] = new String[2];
//         String smallestSubString = s.substring(0, n);
//         String largestSubString = s.substring(0, n);

//         for (int i = 0; i <= s.length() - n; i++) {
//             for (int j = i; j <= i + n; j++) {
//                 if (j < s.length())
//                     ;
//                 String currentSubString = s.substring(i, j);
//                 if (currentSubString.compareTo(smallestSubString) < 0) {
//                     smallestSubString = currentSubString;
//                 }
//                 if (currentSubString.compareTo(largestSubString) > 0) {
//                     largestSubString = currentSubString;
//                 }

//             }

//         }
//         result[0] = smallestSubString;
//         result[1] = largestSubString;
//         return result;

//         // ArrayList<String> resultList = new ArrayList<>();
//         // for (int i = 0; i < s.length(); i++) {
//         // for (int j = i + 1; j < i + n; j++) {
//         // resultList.add(s.substring(i, j));

//         // }
//         // }
//         // return String.join("",resultList);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String");
//         String str = sc.nextLine();
//         System.out.println("Enter Length");
//         int subLen = sc.nextInt();

//         // for (int i = 0; i <str.length(); i++) {
//         // for (int j = i + 1; j <subLen + 1; j++) {
//         // System.out.println(str.substring(i, j));

//         // }
//         // }
//         // System.out.println(subStr(str, subLen));
//         String result[] = subStr(str, subLen);
//         System.out.println(result[0]);
//         System.out.println(result[1]);

//     }

// }


package String;

import java.util.Scanner;

public class string_iamNeo {

    public static String[] subStr(String s, int n) {
        String result[] = new String[2];
        String smallestSubString = s.substring(0, n);
        String largestSubString = s.substring(0, n);

        // Loop through each possible starting index of the substring
        for (int i = 0; i <= s.length() - n; i++) {
            // Loop through each possible ending index of the substring
            for (int j = i; j <= i + n; j++) {
                if (j < s.length()) {
                    // Get the current substring based on the starting and ending indices
                    String currentSubString = s.substring(i, j);

                    // Compare the current substring with the current smallest substring
                    if (currentSubString.compareTo(smallestSubString) < 0) {
                        smallestSubString = currentSubString;
                    }

                    // Compare the current substring with the current largest substring
                    if (currentSubString.compareTo(largestSubString) > 0) {
                        largestSubString = currentSubString;
                    }
                }
            }
        }

        result[0] = smallestSubString;
        result[1] = largestSubString;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter Length");
        int subLen = sc.nextInt();

        String result[] = subStr(str, subLen);
        System.out.println("Lexicographically Smallest Substring: " + result[0]);
        System.out.println("Lexicographically Largest Substring: " + result[1]);
    }

}
