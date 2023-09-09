package Recursion;

public class recursion_sum {
    static int someOfDigits(int n){
        if(n>=0  && n<=9){
            return n;
        }
        // int firstnm1Digits=someOfDigits(n/10); //recursive work
        // int lastDigits=n%10;//self work
        // return firstnm1Digits + lastDigits;

        //OR 

        return someOfDigits(n/10)+n%10;

    }
    public static void main(String[] args) {
        System.out.println(someOfDigits(5683));
        
    }
    
}
