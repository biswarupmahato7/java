import java.util.Scanner;

public class arr_partotion {
    //fiend total sum
    static int findSum(int arr[]){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumpartition(int arr[]){
        int totalSum=findSum(arr);
        int prafixSum=0;
        int sufixsum=0;

        for(int i=0;i<arr.length;i++){
            prafixSum+=arr[i];
            sufixsum=totalSum-prafixSum;
            if(prafixSum==sufixsum){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter array elements: ");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Eqal partition possiable "+equalSumpartition(arr));
       
    }
    
}
