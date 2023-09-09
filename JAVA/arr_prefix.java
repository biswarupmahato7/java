import java.util.Scanner;

public class arr_prefix {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
            System.out.println();
        }
    }

        static int[] prefixSum(int arr[]) {
            ///int prefix[]=new int[arr.length];
            //prefix[0]=arr[0];
            arr[0]=arr[0]; //without creating new memory
            for(int i=1;i<arr.length;i++){
                //prefix[i]=prefix[i-1]+arr[i];
                arr[i]=arr[i-1]+arr[i];
            }
            
            //return prefix;
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

       System.out.println("Prefix Sum array is:");
       printArray(prefixSum(arr));

    }
    
}
