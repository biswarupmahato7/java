import java.util.Arrays;

public class arrReference {
    //Method for print array
    static void printArr(int arr[]) {

    
        for(int i=0;i<arr.length;i++)

        System.out.print(arr[i]);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        
      
        int arr[]=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        System.out.println("Original array");
        printArr(arr);

        //try to copy array
        //int arr_2[]=arr; //Shalllow copy[same address]
        //int arr_2[]=arr.clone(); // Deep copy [Different address in Heep]
        //int arr_2[]=Arrays.copyOf(arr, arr.length); //Deep Coopy
        int arr_2[]=Arrays.copyOfRange(arr, 1,2); //we can give Range to prient
        System.out.println("After copying the array ");
        printArr(arr_2);

        //Change the arr_2 elements 
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("After changing the array element Original array is ");
        printArr(arr);

        System.out.println("After changing the array element copied array is ");
        printArr(arr_2);

        //Here Original is also changed || NO new memory allocated for arr_2 Both aare using same memory addrass in Heap
    }
  
    
}
