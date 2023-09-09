  package Accenture;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ac_Q12 {
    static int removeDup(int arr[]){

        Arrays.sort(arr);
        int max1 = arr[arr.length - 1];

         int max2= Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

         int Max2=max2;
        //int max2 = arr[arr.length - 2];

        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i:arr){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
            else{
                mp.put(i,mp.get(i)+1);
            }
        }
        int max1val=mp.get(max1);
        int max2val=mp.get(Max2);

        return (max1val+max2val)-2;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //int unique=removeDup(arr);
        System.out.println("NO OF STUDENT We have to Remove: "+ removeDup(arr));
    }                                
    
}








