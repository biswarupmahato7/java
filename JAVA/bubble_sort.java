public class bubble_sort {
    // static void bubbleSort(int arr[]){
    //     int n=arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }

    // }
    // public static void main(String[] args) {
    //     int arr[]={7,6,5,4,3};
    //     bubbleSort(arr);
    //     for(int i:arr){
    //         System.out.println(i+ " ");
    //     }
        
    // }
    
    //OPTIMIZED CODE
    static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;// Has any Swapping is happened 
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true; //  some Swapping is done 
                }
            }
            if(flag==false){ //have any swap Happened
                return;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={7,6,3,2,8};
        bubbleSort(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }
        
    }
}
