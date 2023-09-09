// Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. 
// The relative order of odd or even integers does not matter. Return any array that satisfies the condition.

import java.util.Scanner;

public class arr_Odd_Even {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    //parity - Odd Even term its calles parity;
    static void sortArrayByParity(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0 && arr[right]%2==1){
                left++;
                right--;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

        }
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
        sortArrayByParity(arr);

    }

}
