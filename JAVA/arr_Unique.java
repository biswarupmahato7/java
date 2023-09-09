//Fiend the Unique number from the  the array  Lecture 16-Array Manipulation

import java.util.*;
public class arr_Unique {
    static int unique(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
                
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            {
                if(arr[i]>0)
                ans=arr[i];
            }   
        }
        return ans;
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
        System.out.println("The Unique element is :"+unique(arr));
        
    }
}
