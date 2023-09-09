package HashMap;
import java.util.*;

public class twoSum {
    public static int[] TwoSum(int arr[],int target){
        int n=arr.length;
        int ans[]=new int[2];
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-arr[i];
            if(mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }else{
                mp.put(arr[i],i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,7,11,15};
        System.out.println("Enter Target");
        int target=sc.nextInt();
        int idx[]=TwoSum(arr, target);
        System.out.println(idx[0]+" "+idx[1]);

    }
    
}
