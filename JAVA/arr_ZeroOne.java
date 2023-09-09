import java.util.Scanner;

public class arr_ZeroOne {
    // DOUBLE TRAVERS

    // static void zeroOne(int arr[]){
    // //count no of Zeros
    // int zero=0;
    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==0){
    // zero++;
    // }

    // }
    // // index 0 to zero-1 put 0, others fll with 1
    // for(int i=0;i<arr.length;i++){
    // if(i<zero){
    // arr[i]=0;
    // }else{
    // arr[i]=1;
    // }

    // }
    // for( int i=0;i<arr.length;i++){

    // System.out.println(arr[i]);

    // }

    // }

    // SINGAL TRAVERS
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    

    static void zeroOne(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;

            }
            if (arr[left] == 0 && arr[right] == 1) {
                left++;
                right--;

            }

        }
        // for (int i = 0; i < arr.length; i++) {

        //     //System.out.println(arr[i]);
        //     printArr(arr);
            
        // }
        printArr(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array is:");
        zeroOne(arr);
    }

}
