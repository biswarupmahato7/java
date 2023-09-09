// public class insertion_sort {
//     static void insertionSort(int arr[]) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int j = i;
//             while (j > 0 && arr[j] < arr[j - 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j - 1];
//                 arr[j - 1] = temp;
//                 j--;
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = { 8, 3, 6, 2, 4, 5 };
//         insertionSort(arr);
//         for (int i : arr) {
//             System.out.println(i + " ");
//         }
//     }

// }


public class insertion_sort{
     //ASCENDING ORDER

    static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i; // j=the element we want to move it in its right position
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--; // we swap j index with j-1 , so j's index --;
            }
        }
    }
   //DESCENDING ORDER

    static void insertionSortDec(int arr[]){
        int n =arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }
    }


    public static void main(String[] args) {
        int arr[]={5,3,2,7,9,1};
        insertionSort(arr);
        System.out.println("Sorted in Increasing Order");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(" Sorted in Dec Order");
        insertionSortDec(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
