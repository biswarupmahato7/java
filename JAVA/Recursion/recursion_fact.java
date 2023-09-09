package Recursion;
// public class recursion_fact {
//     static int calculateFact(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_nm1=calculateFact(n-1);
//         int fact=n*fact_nm1;
//         return fact;
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int ans= calculateFact(n);
//         System.out.println("factorial  is "+ans);
//     }
    
// }

public class recursion_fact{
    static int calculateFact(int n){
        if( n==0){
            return 1;
        }
        return n*calculateFact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(calculateFact(5)); 
        

    }
}