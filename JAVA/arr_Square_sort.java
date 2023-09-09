import java.util.Scanner;

public class arr_Square_sort {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
static void swapArray(int arr[],int  i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    

}

static void reverseArrInplace(int arr[],int size){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        swapArray(arr,i,j);
        i++;
        j--;

    }
}
    static int[] sortSquare(int arr[]){
        int left=0;
        int right=arr.length-1,k=0;
        int ans[]=new int[arr.length];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Sorted array is  : " );
        reverseArrInplace(arr, size);
        int ans[]=sortSquare(arr);
        printArray(ans);
        
        

    }
    
}
