import java.util.Scanner;

public class arr_2D_prefixSum {

    static void prefixSumMatrix(int arr2[][]) {
        int r = arr2.length;
        int c = arr2[0].length;
        // for calculate row wise prfix
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) { //j=1,because we have to add previous element in j
                arr2[i][j] += arr2[i][j - 1];
            }
        }
    }

    static int findSum(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSumMatrix(arr);
        for (int i = l1; i <= l2; i++) { //calculate the sum of r1 to r2 for row i
            if (r1 >= 1) {
                sum += arr[i][r2] - arr[i][r1-1];
            } else {
                sum += arr[i][r2];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row num: ");
        int r = sc.nextInt();
        System.out.println("Enter col num: ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];

        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter l1 & r1 l2 r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        //System.out.println("Enter l2 & r2");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Some of the Reactangle is: "+ findSum(mat, l1, r1, l2, r2));

    }

}


// import java.io.*;
// import java.util.*;
// public class arr_2D_prefixSum 
// {
// public static int solve(int[][] a, int l1, int l2, int r1, int r2){
// int ans = 0;
// int n = a.length, m = a[0].length;
// // calculating the horizontal sum for each row in the Matrix
// for(int i = 0; i < n; i++) { // 'i' is row
// for(int j = 1; j < m; j++) { // 'j' is column
// a[i][j] += a[i][j-1];
// }
// }
// // now only traversing over rows through below for loop
// // as we have precalculated prefix matrix
// for(int i = l1; i <= l2; i++) {
// if(r1 >= 1)ans += a[i][r2] - a[i][r1-1];
// else ans += a[i][r2];
// }
// return ans;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the no of rows");
// int row = sc.nextInt();
// System.out.println("Enter the no of columns");
// int col = sc.nextInt();
// int[][] matrix = new int[row][col];
// System.out.println("Enter the elements of matrices");
// for(int i=0;i<row;i++){
// for(int j=0;j<col;j++){
// matrix[i][j]=sc.nextInt();


// }
// }
// System.out.println("Enter the value of l1,l2,r1,r2");
// int l1 = sc.nextInt();
// int l2 = sc.nextInt();
// int r1 = sc.nextInt();
// int r2 = sc.nextInt();
// System.out.println(solve(matrix,l1,l2,r1,r2));
// }
// }
