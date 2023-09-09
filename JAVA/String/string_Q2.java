// Given a string s, return the number of palindromic substrings in it.
// input- s= "abc"  O/p-3

package String;

import java.util.Scanner;

public class string_Q2 {

    static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                if (isPalindrom(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }

            }
        }

        System.out.println(" \nThe Number of Palindromic Substring are: " + count);

    }

}
