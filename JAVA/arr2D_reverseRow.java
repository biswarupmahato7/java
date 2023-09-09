import java.util.Scanner;
public class arr2D_reverseRow {
    static void printArr(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    // static void swap(int arr[][],int i,int start,int end){
    //     int start=0;
    //     int end=arr.length-1;
         
    //     while(arr[end]>arr[start]){
    //         int temp=arr[i][strat];
    //         arr[i][start]=arr[i][end];
    //         arr[i][end]=temp;
    //         start++;
    //         end++;
            
    //     }
    // }
    static void swap(int[][] arr,int i,int start,int end ){
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
    }
    
    static void reveresOfMatrix(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            int start=0;
            int end=c-1;
            while(start < end){
                swap(arr,i,start,end);
                start++;
                end--;
            }
        }

    }
    // static void reverseArray(int arr[],int r){
    //     for(int i=0;i<r;i++){
    //         swap();
            
    //     }
          
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Numbers: ");
        int r=sc.nextInt();
        System.out.println("Enter COL Numbers: ");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Real Arrray ");
        printArr(arr, r, c);
        reveresOfMatrix(arr, r, c);
        System.out.println("After Revarse the Row: ");
        printArr(arr, r, c);
        

    }
    
}
