package Recursion;

public class recursion_countDig {
    static int countDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        int no0fDigits=countDigits(n/10)+1; //n/10 = count all the digits expect last digit +1 for last digit
        return no0fDigits;

    }
    public static void main(String[] args) {
        System.out.println(countDigits(1345));
    }
    
}
