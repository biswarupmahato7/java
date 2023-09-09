//GIVE A NUMBER N,PRINT THE FLOWING PATTERN WITHOUT USING ANY LOOP 
// INPUT- 16 || OP- 16,11,6,1,-4,1,6,11,16

package Recursion;

import java.util.Scanner;

public class recurision_Asi3 {
    static void printPattern(int n, int m, boolean flag) {
        System.out.print(m + " ");
        // Base case
        if (n == m && flag == false) {
            return;
        }

        if (flag) {

            if (m - 5 > 0) {

                printPattern(n, m - 5, true);
            } else
                printPattern(n, m - 5, false);
        } else
            printPattern(n, m + 5, flag);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printPattern(n, n, true);
    }

}
