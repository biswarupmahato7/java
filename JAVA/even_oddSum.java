import java.util.Scanner;

public class even_oddSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num=sc.nextInt();
        int ans=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                ans-=i;
            }else

            {
                ans+=i;
            }
            
        }
        System.out.println("The ans is = "+ans);

    }
    
}
