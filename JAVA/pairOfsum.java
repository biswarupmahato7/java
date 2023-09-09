import java.util.Scanner;

public class pairOfsum {
    static int sumOfpairs(int arr[],int targer){
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]+arr[j]==targer)
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target elements : ");
        int target=sc.nextInt();
        System.out.println("The total no of sum pair found is : "+sumOfpairs(arr, target));

    }

    
}
