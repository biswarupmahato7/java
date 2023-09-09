
//Fiend the total numbers of triplets in the array Whose sum is equal to the given value X
import java.util.Scanner;

class arr_pairOftriplets  {
  static int pair0fsum(int arr[],int target){
    int ans=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        for(int k=j+1;k<arr.length;k++)
        {
          if(arr[i]+arr[j]+arr[k]==target)
          ans++;
        }
      }
      
    }
    return ans;

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter size of array: ");
    int size=sc.nextInt();

    System.out.println("Enter array elements: ");
    int arr[]=new int[size];

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target elements: ");
    int target=sc.nextInt();
    System.out.println("Total number of Target's sum pairs is "+pair0fsum(arr, target));
  }
}