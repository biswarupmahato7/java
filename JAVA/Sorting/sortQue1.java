//GIVEN A INTEGER ARRAY MOVE ALL '0' AT THE END OF THE ARRAY,WHILE MAINTAINING THE RELATIVE ORDER OF NON-ZERO ELEMENT
//I/P--[0 5 0 3 42]  O/P-[5 3 42 0 0]

public class sortQue1 {
    static void moveZero(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }

            }
            if (flag == false) {
                return;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 5, 0, 3, 42 };
        moveZero(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
