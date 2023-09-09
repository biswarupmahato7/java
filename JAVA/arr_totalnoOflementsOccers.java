//Fiend total number of elements Occers in a array input:[1,1,1,2,3] x=1; output 1 is 3 times
import java.util.Scanner;
public class arr_totalnoOflementsOccers {


  static int elementOccers(int arr[],int x){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==x){
        count++;
      }
    }
    return count;

  }
  public static void main(String[] args) {
    // int arr[]={5,6,5,1,5};
    // int count=0;
    // int x=5;
    // for(int arr_2:arr)
    // {
    //   if(arr_2==x)
    //   count++;
    // }
    // System.out.println("Total  no  of 5 is : "+count);
   
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int size=sc.nextInt();
    System.out.println("Enter array elements ");
    int arr[]=new int[size];

    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();

    }
    System.out.println("Enter the element you want to fiend ");
    int x=sc.nextInt();
    System.out.println("Total number of x is "+elementOccers(arr, x));


  }
}
    

