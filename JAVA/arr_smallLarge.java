import java.util.Arrays;
import java.util.Scanner;


public class arr_smallLarge {
    static int[] smallAndlarge(int arr[]){
        Arrays.sort(arr);
        int ans[]={arr[0], arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();

        System.out.println("Enter array elements");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=smallAndlarge(arr);
        System.out.println("Smallest " +arr[0] );
        System.out.println("Largest " +arr[arr.length-1] );
        
    }
    
}
