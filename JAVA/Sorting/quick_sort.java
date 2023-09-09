public class quick_sort {

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int arr[], int st, int end) {
        int pivot = arr[st];
        int count = 0; // count less then element of pivot;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                count++; // = to handel Duplicate Element

        }
        int pivot_index = st + count;
        swap(arr, st, pivot_index);

        int i = st;
        int j = end;
        while (i < pivot_index && j > pivot_index) { // element less or equal are left of pivotIndex and grater are in right
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < pivot_index && j > pivot_index) { // check before swap
                swap(arr, i, j);
                i++;
                j++;

            }

        }
        return pivot_index;

    }

    static void quickSort(int arr[], int st, int end) {
        if (st >= end)
            return; // if both are same then return

        int pi = partition(arr, st, end);

        quickSort(arr, st, pi - 1); // left of pivot
        quickSort(arr, pi + 1, end); // right of pivot

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 6, 9 };
        int n = arr.length -1;
        System.out.println("Before Sorting");
        printArray(arr);
        quickSort(arr, 0, n);
        System.out.println();

        System.out.println("After Sorting");
        printArray(arr);

    }

}
