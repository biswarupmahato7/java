//package Sorting;

public class selection_sort {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the Current Index
            // fiend min index in unsorted array
            int min_index = i;
            for (int j = i + 1; j < n; j++) { // travers the rest of the array and if u find any element less then
                                              // current element (min_index) then Update min_index
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }

            }
            // Swap current element & min element --Current index i will have correct
            // element
            // swap arr[min_index] & arr[i]
            if (min_index != i) { // if both are == no need to swap
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;

            }

        }

    }
    //DECREASING ORDER
    static void selectionSortDesc(int arr[]){
          int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[max_index]<arr[j]){
                    max_index=j;
                }
            }
            if(max_index!=i){
            int temp=arr[i];
            arr[i]=arr[max_index];
            arr[max_index]=temp;
        }

            }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 4, 1, 3 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        selectionSortDesc(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
