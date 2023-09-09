import java.util.Scanner;
public class arr2D_transposeMatrix {
    static void printArr(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static int[][] transposeMatrix(int arr[][],int r,int c){
        int arr2[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                arr2[i][j]=arr[j][i];

            }
        }
        printArr(arr2, r, c);
        return arr2;
    }
    static void inPlaceTranspose(int arr[][],int r,int c){ //only for Square Matrix
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
    }
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
        System.out.println("Before Transpose ");
        printArr(arr, r, c);
        //int arr2[][]=transposeMatrix(arr, r, c);
        System.out.println("After Transpose ");
        //transposeMatrix(arr, r, c);
        inPlaceTranspose(arr, r, c);
        printArr(arr, r, c);
    }
    
}
