import java.util.Scanner;

// public class bipul {
//     static boolean difference(int arr[], int size) {

//         if (size > 1) {
//             int dif;
//             int count = 0;
//             // int j=0;
//             for (int i = 1; i < size; i++) {
//                 for (int j = i + 1; j < size; j++) {
//                     dif = arr[j] - arr[i];

//                     if (dif == 1) {

//                         count++;
//                     }
//                 }

//                 if (count > 0) {
//                     return true;
//                 }
//             }

//         }

//         return false;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array Size:");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.println("Enter array elements: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Ans is : " + difference(arr, size));

//     }

// }

class bipul {
    static boolean difference(int arr[], int size) {
        if (size > 1) {
            int count = 0;
            int dif = 0;
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {

                    dif = arr[j] - arr[i];

                    if (dif == 1) {
                        count++;
                    }

                    if (count > 0) {
                        return true;

                    }

                }

            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(difference(arr, size));
    }
}