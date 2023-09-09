import java.util.Scanner;

public class arr_2D_pascal {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    static int[][] pascalTriangle(int row) {
        int ans[][] = new int[row][];

        for (int i = 0; i < row; i++) {

            ans[i] = new int[i + 1];

            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i ; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1]; // previous row ,same col + previous row, previous col
            }

        }
        return ans;

    }
    // static int[][] pascal(int n){
    //     int[][] pascal = new int[n][n];
    //     for(int i=0;i<n;i++){
    //         pascal[i][0] = 1;
    //         for(int j=1;j<i+1;j++){
    //             pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
    //         }
    //     }
    //     return pascal;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row size: ");
        int row = sc.nextInt();
        int ans[][] = pascalTriangle(row);
        printArray(ans);

    }

}
