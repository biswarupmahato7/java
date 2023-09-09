
//REVERSE ARRAY WITH NEW MEMORY
import java.util.Scanner;
public class arr_reverse {
//     static int[] reverseArr(int arr[]){
//         int j=0;
//         int size=arr.length;
//         int i=size-1;
//         int ans[]=new int[size];
//         // for(int i=arr.length-1;i>=0;i--){
//             //     ans[j++]=arr[i];
            
//             // }
            
//             while(i>=0){
//                 ans[j++]=arr[i--];
//             }
//         return ans;
   
//}

//REVERSE ARRAY WITHOUT NEW MEMORY

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
    for( i=0;i<size;i++){
        
        System.out.println(arr[i]);
        
    }


}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();

        System.out.println("Enter array elements ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //int ans[]=reverseArr(arr);
      
       reverseArrInplace(arr,size);
      

        // System.out.println("Reverse arrray is ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }  
    }
}


