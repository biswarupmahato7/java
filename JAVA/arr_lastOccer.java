import java.util.Scanner;

// Fiend the last inder X occers
public class arr_lastOccer {
    static int lastOccres(int arr[],int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                lastIndex=i;

            }
        }
        return lastIndex;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("last inndex of x is:"+lastOccres(arr, x));
    }
    
}
