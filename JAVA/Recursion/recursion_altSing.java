//GIVEN A NUMBER N , find the sum of natural number till n but with  in alternative sing 
//eg- input 5 ,op-3(1-2+3-4+5=3)

package Recursion;

public class recursion_altSing {
    static int findSum(int n) {
        if (n == 0)
            return 0;

        if (n % 2 == 0) {
            return findSum(n - 1) - n; // for even
        } else
            return findSum(n - 1) + n;// for odd
    }

    public static void main(String[] args) {
        System.out.println(findSum(10));


    }

}
