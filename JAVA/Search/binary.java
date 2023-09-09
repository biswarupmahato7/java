package Search;

public class binary {
    static boolean recursiveBinary(int arr[],int start,int end,int target){
        if(start>end) return false; //base case
        int mid=(start+end)/2;

        if(arr[mid]==target)
        return true;
        else if(target>arr[mid]){
            return recursiveBinary(arr, mid+1, end, target);
        }   else
            return recursiveBinary(arr, start, mid-1, target);


    }
    static boolean binarySearch(int arr[],int target){
        int n=arr.length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return true;
            }else if(target<arr[mid]){
                end=mid-1;
            }
            else
            start=mid+1;
        }
        return false;


    }
    public static void main(String[] args) {
       // int arr[]={1,2,3,4,5,6,7,};
       int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int target =8;
        System.out.println(binarySearch(arr, target));

        System.out.println("using recursion");
        System.out.println(recursiveBinary(arr, 0, n-1, target));
    }
    
}
