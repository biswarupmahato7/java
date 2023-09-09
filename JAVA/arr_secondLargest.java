import java.util.Scanner;
public class arr_secondLargest {
    static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondLargest(int arr[]){
        int max=largest(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE; //Change  the Max value exist in the array
            }
        }
        int secondMax=largest(arr);
        return secondMax;
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
        System.out.println("Maximum number is : "+largest(arr));
        System.out.println(" Second Maximum number is : "+secondLargest(arr));
        
    }
    
}
