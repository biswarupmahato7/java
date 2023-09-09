
package Search;

public class firstOccerce {
    static int firstOcerence(int arr[],int target){
        int n=arr.length;
        int st=0,end=n-1;
        int firstOc=-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(arr[mid]==target){
                end=mid-1;
                firstOc=mid;

            }
            else if(arr[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return firstOc;


    }
    public static void main(String[] args) {
        int arr[]={1,2,5,5,6,7,7,9};
        int target=5;
        System.out.println(firstOcerence(arr,target));

    }
    
}
