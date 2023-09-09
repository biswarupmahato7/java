import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st numebr");
        int a=sc.nextInt();
        System.out.println("Enter 2nd numebr");
        int b=sc.nextInt();

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap the two number a= "+a+",b="+b);
    }
    
}
