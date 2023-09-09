
import java.util.Scanner;
public class arr_Q_prefixSum {

    // static void printArray(int arr[]) {
    //     for(int i=1;i<=arr.length;i++){
    //         System.out.print(arr[i] +" ");
    //         System.out.println();
    //     }
    // }
    static int[] prafixSum(int arr[]){
        //arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i]; 
        }
        return arr;
    }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size+1];

        System.out.println("enter array elements: ");
       for(int i=1;i<=size;i++){
        arr[i]=sc.nextInt();
       
       }
       int preSum[]=prafixSum(arr);// prefix sum store here
       
       System.out.println("Enter Quary numbers");
       int q=sc.nextInt();

       while(q-->0){
        
        System.out.println("Enter r= ");
        int r=sc.nextInt();
        System.out.println("Enter l= ");
        int l=sc.nextInt();
        int ans =preSum[r]-preSum[l-1];
        System.out.println("Sum is "+ans);
        
       }
        
        
    }
    
}
