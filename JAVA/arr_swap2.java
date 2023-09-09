import java.util.Scanner;

public class arr_swap2 {
    static void swap(int a,int b){
        System.out.println("Original values of a= "+a+",b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping  values of a= "+a+",b= "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter  value of b: ");
        int b=sc.nextInt();
        swap(a, b);
    }
    
}
