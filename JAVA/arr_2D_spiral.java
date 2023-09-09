import java.util.Scanner;

public class arr_2D_spiral {

    static void printArray(int arr[][],int r,int c){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static void printSpiralOrder(int[][]arr,int r,int c){
        int topRow=0,bottomRow=r-1,rightCol=c-1,leftCol=0;
        int totalElement=0;

        while(totalElement<r*c){
            //print TopRow > Right col to left col
            for(int j=leftCol;j<=rightCol && totalElement<r*c;j++){
                System.out.println(arr[topRow][j]+" ");
                totalElement++;

            }
            topRow++;

            //print Right col > topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElement<r*c;i++){
                System.out.println(arr[i][rightCol]+" ");
                totalElement++;
            }
            rightCol--;

            //print BottomRow >> lRightCol to LeftCol
            for(int j=rightCol;j>=leftCol && totalElement<r*c;j--){
                System.out.println(arr[bottomRow][j]+" ");
                totalElement++;

            }
            bottomRow--;

            //print left Col >> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElement<r*c;i--){
                System.out.println(arr[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row NUmbers");
        int r=sc.nextInt();
        System.out.println("Enter Col NUmbers");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter total "+r*c+" elements for array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        printArray(arr, r, c);

        System.out.print("Spiral OutPut is");
        printSpiralOrder(arr, r, c);
       

    }
    
}
