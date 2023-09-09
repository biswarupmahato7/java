import java.util.Scanner;
public class arr2D_sum {
    static void printMat(int mat[][],int r ,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
                
            }
            System.out.println(" ");
        }
        
    }
    static void addMat(int mat1[][],int mat2[][],int r,int c){
        if(mat1[r]!=mat2[r] || mat1[c]!=mat2[c] ){
            System.out.println("Addition cant possiable because of wrong input");
            return;
        }
        int sum[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("The sum is: ");
        printMat(sum, r, c);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number");
        int r=sc.nextInt();
        System.out.println("Enter col number");
        int c=sc.nextInt();
        int mat1[][]=new int[r][c];
        int mat2[][]=new int[r][c];

        System.out.println("Enter first matrix elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter second matrix elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("First Matrix is ");
        printMat(mat1, r, c);
        System.out.println("second  Matrix is ");
        printMat(mat2, r, c);
        System.out.println("Addition of two matrix is: ");
        addMat(mat1, mat2, r, c);
    
    }
    
}
