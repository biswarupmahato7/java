import java.util.Scanner;
class countDegits{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        int countNum=0;
        for(int i=0;num>0;i++)
        // while(num>0)
        {
            num=num/10;
            countNum++;
        }
        System.out.println("Total number is = "+countNum);
    }

}