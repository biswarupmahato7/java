import java.util.Scanner;
public class arr_checkSorted {
    static boolean checkSorted(int arr[]){
        boolean check =true;
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;;
            }
        }
        return check;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=sc.nextInt();
        System.out.println("Enter array elements ");
        int arr[]=new int[size];
    
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
    
        }
        System.out.println("Array is Sorted "+checkSorted(arr));
    }
    
}
