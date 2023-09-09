import java.util.Scanner;

public class recursion {
    static void printSum(int i,int n,int total_sum){
        if(i==n){
            total_sum+=i;
            System.out.println(total_sum);
            return;
        }
        System.out.println(i);
        total_sum+=i;
        printSum(i+1, n, total_sum);
        
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printSum(1, 5, 0);
        
 
    }
    
}
