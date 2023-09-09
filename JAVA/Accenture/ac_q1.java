package Accenture;
import java.util.*;

public class ac_q1 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size- ");
        int size=sc.nextInt();

        System.out.println("Enter array elements");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int evenIndexArray[]=new int[size];
        int oddIndexArray[]=new int[size];

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenIndexArray[i]=arr[i];

            }
            else{
                oddIndexArray[i]=arr[i];
            }
        }

        Arrays.sort(evenIndexArray);
        printArray(evenIndexArray);
        Arrays.sort(oddIndexArray);
        printArray(oddIndexArray);

        int slOfEven=evenIndexArray[evenIndexArray.length-2];
        int slOfOdd=oddIndexArray[oddIndexArray.length-2];

        int sumOfsl=slOfEven+slOfOdd;
        System.out.println("The sum of two second largest is: "+sumOfsl);
        

    }
    
}