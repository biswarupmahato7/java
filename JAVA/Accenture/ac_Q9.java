// package Accenture;

// import java.util.*;

// public class ac_Q9 {
//     static int unique(int arr1[], int arr2[]) {
//         List<Integer> newArray = new ArrayList<>();
//         for (int i : arr1) {
//             boolean flag = false;
//             for (int j : arr2) {
//                 if (i == j) {
//                     flag = true;
//                     break;
//                 }
//             }
//             if (!flag) {
//                 newArray.add(i); // Add the element to newArray if it's not in arr2
//             }
//         }
//         return newArray;
//     }

//     static int noOFstons(int arr[], int max) {
//         Arrays.sort(arr);
//         int ans = 0;
//         int noofStones=0;
//         for (int i = 0; i < arr.length; i++) {
//             if (ans <= max) {
//                 ans += arr[i];
//                 noofStones=i;
//             }

//         }
//         return noofStones;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of M: ");
//         int m = sc.nextInt();
//         int arr1[] = new int[m];
//         System.out.println("Enter Stones: ");
//         for (int i = 0; i < m; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         System.out.println("Enter the Total No. Of Common Stones: ");
//         int n = sc.nextInt();
//         int arr2[] = new int[n];
//         System.out.println("Enter common stones: ");
//         for (int i = 0; i < n; i++) {
//             arr2[i] = sc.nextInt();
//         }
//         System.out.println("Enter max capacity");
//         int maxCapacity = sc.nextInt();

        
//         int num=noOFstons(li, maxCapacity);
//         //System.out.println(li);
//     }
// }

package Accenture;

import java.util.*;

public class ac_Q9 {
    static List<Integer> unique(int arr1[], int arr2[]) {
        List<Integer> newArray = new ArrayList<>();
        for (int i : arr1) {
            boolean flag = false;
            for (int j : arr2) {
                if (i == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                newArray.add(i);
            }
        }
        return newArray;
    }

    static int noOFstons(List<Integer> arr, int max) {
        //Collections.sort(arr);
        int ans = 0;
        int noofStones = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (ans + arr.get(i) <= max) {
                ans += arr.get(i);
                noofStones = i + 1; // Increment by 1 to get the count
            } else {
                break; // Stop when capacity is exceeded
            }
        }
        //System.out.println("Number of stones: " + noofStones);
        return noofStones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M: ");
        int m = sc.nextInt();
        int arr1[] = new int[m];
        System.out.println("Enter Stones: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Total No. Of Common Stones: ");
        int n = sc.nextInt();
        int arr2[] = new int[n];
        System.out.println("Enter common stones: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> li = unique(arr1, arr2);

        System.out.println("Enter max capacity");
        int maxCapacity = sc.nextInt();

        int numberOfStones = noOFstons(li, maxCapacity);
        System.out.println("Number of stones that can be carried: " + numberOfStones);
    }
}
