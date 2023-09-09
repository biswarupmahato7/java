public class marge_sort {
    static void printArray(int arr[]) { // print Array
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    static void marge(int arr[], int l, int mid, int r) { // Here we marge the two array 1st & 2nd half
        int n1 = mid - l + 1; // Size of Left Array
        int n2 = r - mid; // Size of Right Array

        int left[] = new int[n1]; // empty
        int right[] = new int[n2]; // empty
        int i, j, k;

        for (i = 0; i < n1; i++)
            left[i] = arr[l + i]; // Fill the Left part //copy 1st part
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j]; // Fill the Right part //copy 2nd part

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) { //if left is small overwrite i
                arr[k++] = left[i++];
            } else
                arr[k++] = right[j++]; // overwrite j in right

        }
        while (i < n1) {
            arr[k++] = left[i++];

        }
        while (j < n2) {
            arr[k++] = right[j++];

        }

    }

    static void margeSort(int arr[], int l, int r) { // Marge Sort Method
        if (l >= r)
            return; // If the Array is Single Size
        int mid = (l + r) / 2;
        margeSort(arr, l, mid); // Sort l to mid (1st half) //left
        margeSort(arr, mid + 1, r); // Sort mid+1 to r (2nd half) //right

        marge(arr, l, mid, r);

    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 9, 4, 1, 7 };
        int n = arr.length;
        System.out.println("Array Before Sorting");
        printArray(arr);
        margeSort(arr, 0, n - 1);
        System.out.println("Array after Sorting");
        printArray(arr);

    }

}

