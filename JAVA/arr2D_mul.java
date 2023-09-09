import java.util.Scanner;
class arr2D_mul{
    static void printArr(int arr[][],int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    static void mulMatrix(int mat1[][],int r1,int c1, int mat2[][], int r2,int c2){
        if( c1!=r2){
            System.out.println(" Invalid input ");
            return;
        }
        int mul[][]=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++)//FOR ADDITION {
                    mul[i][j]+=(mat1[i][k]*mat2[k][j]);
                }
            }
            printArr(mul,r1,c2);
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Matrix  row");
        int r1=sc.nextInt();

        System.out.println("Enter First Matrix  coloum");
        int c1=sc.nextInt();

        System.out.println("Enter matrix elements: ");
        int mat1[][]=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix  row");
        int r2=sc.nextInt();

        System.out.println("Enter Second Matrix  coloum");
        int c2=sc.nextInt();

        System.out.println("Enter matrix elements: ");
        int mat2[][]=new int[r2][c2];
        
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println(" First Matrix is ");
        printArr(mat1, r1, c1);
        System.out.println(" Second Matrix is ");
        printArr(mat2, r2, c2);
        System.out.println("Matrix multeplicatio is :");
        mulMatrix(mat1, r1, c1, mat2, r2, c2);

    }
}