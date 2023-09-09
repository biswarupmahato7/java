//Given an array of length N, find the Length of the Largest Subarray with sum equal to 0.
 // i/p- N=8; arr[]=15,-2,2,-8,1,7,10,23
//Output-5


package HashMap;
import java.util.*;

public class largeSubArr {
   static int zeroSumSubArray(int arr[],int n){
        HashMap<Integer,Integer> mp=new HashMap<>(); //prefixsum,index
        int maxLength=0,prefixsum=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];

            if(mp.containsKey(prefixsum)){
                maxLength=Math.max(maxLength,i-mp.get(prefixsum)); //if we get batter sub array then update  (current idx-first occur idx)
            }else{
                mp.put(prefixsum,i);

            }
        }
        return maxLength;

    }
    public static void main(String[] args) {
        
    }
    
}
