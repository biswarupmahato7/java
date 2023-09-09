
import java.util.Scanner;

public class arr_sufix {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
            System.out.println();
        }
    }

        static int[] sufixSum(int arr[]) {
            
           int n=arr.length-2;
            for(int i=n;i>=0;i--){
                
                arr[i]=arr[i+1]+arr[i];
            }
            
            return arr;
        }

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter array elements: ");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       
       }
       System.out.println("Original array is");
       printArray(arr);

       System.out.println("sufix Sum array is:");
       printArray(sufixSum(arr));

    }
    
}

