//Fiend first Repeted element 

import java.util.Scanner;

public class arr_repeat {
    static int repearelement(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    ans=arr[i];
                    return ans;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("First Repeted element is : "+repearelement(arr));
        
    }
    
}
