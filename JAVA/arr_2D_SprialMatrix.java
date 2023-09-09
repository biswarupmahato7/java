//Given a posative nummber n, Generate a NxN matrix with element from 1to N^2
import java.util.Scanner;
public class arr_2D_SprialMatrix {
    static void printMat(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int arr[][]=new int[n][n];
        int topRow=0,bottomRow=n-1,rightCol=n-1,leftCol=0;
        int num=1;
        //int totalElement=0;
        while(num<=n*n){
            //top row
            for(int j=leftCol;j<=rightCol && num<n*n;j++){
                arr[topRow][j]=num;
                num++;
                
            }
            topRow++;
            //right col
            for(int i=topRow;i<=bottomRow && num<n*n;i++){
                arr[i][rightCol]=num;
                num++;
                
            }
            rightCol--;
            //bottom row
            for(int j=rightCol;j>=leftCol && num<n*n;j--){
                arr[bottomRow][j]=num;
                num++;
                
            }
            bottomRow--;
            //leftCol
            for(int i=bottomRow;i>=topRow && num<n*n;i--){
                arr[i][leftCol]=num;
                num++;
                
            }
            leftCol++;
        }

        return arr;
        //printMat(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Ans is: ");
        int arr[][]=generateSpiralMatrix(n);
        printMat(arr);
        
        

    }
    
}
