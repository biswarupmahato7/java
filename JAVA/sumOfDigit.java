import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        int sum=0;
        for(int i=0;num>0;i++){
            sum=sum+num%10;
            num=num/10;
        
        }
        System.out.println("the Sum is="+sum);
    }
    
}
