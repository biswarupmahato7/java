// public class password {
//     public static int generatePassword(int input1, int input2, int input3, int input4, int input5) {
//         int[] numbers = {input1, input2, input3, input4, input5};
//         int maxUnstable = Integer.MIN_VALUE;
//         int minUnstable = Integer.MAX_VALUE;
//         int unstableCount = 0;

//         for (int number : numbers) {
//             if (isUnstable(number)) {
//                 unstableCount++;
//                 maxUnstable = Math.max(maxUnstable, number);
//                 minUnstable = Math.min(minUnstable, number);
//             }
//         }

//         if (unstableCount == 0) {
//             return 0; // No unstable numbers, return 0 as password
//         }

//         return maxUnstable + minUnstable;
//     }

//     public static boolean isUnstable(int number) {
//         String numberString = String.valueOf(number);
//         int[] digitCount = new int[10];

//         for (char digit : numberString.toCharArray()) {
//             digitCount[digit - '0']++;
//         }

//         int firstDigitCount = -1;

//         for (int count : digitCount) {
//             if (count > 0) {
//                 if (firstDigitCount == -1) {
//                     firstDigitCount = count;
//                 } else if (count != firstDigitCount) {
//                     return true; // Unstable number
//                 }
//             }
//         }

//         return false; // Stable number
//     }

//     public static void main(String[] args) {
//         int input1 = 12;
//         int input2 = 1313;
//         int input3 = 122;
//         int input4 = 678;
//         int input5 = 298;

//         int password = generatePassword(input1, input2, input3, input4, input5);
//         System.out.println("Password: " + password);
//     }
// }
//import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class password{
//     public static int generatePassword(int input1, int input2, int input3, int input4, int input5) {
//         int[] numbers = {input1, input2, input3, input4, input5};
//         List<Integer> stableNumbers = new ArrayList<>();
//         List<Integer> unstableNumbers = new ArrayList<>();

//         // Classify numbers as stable or unstable
//         for (int number : numbers) {
//             int[] digitCounts = new int[10];
//             for (char digit : String.valueOf(number).toCharArray()) {
//                 digitCounts[digit - '0']++;
//             }
//             boolean isStable = true;
//             for (int count : digitCounts) {
//                 if (count > 0 && count != digitCounts[digit - '0']) {
//                     isStable = false;
//                     break;
//                 }
//             }
//             if (isStable) {
//                 stableNumbers.add(number);
//             } else {
//                 unstableNumbers.add(number);
//             }
//         }

//         // Calculate the password
//         int maxUnstable = Collections.max(unstableNumbers);
//         int minUnstable = Collections.min(unstableNumbers);
//         int password = maxUnstable + minUnstable;

//         return password;
//     }

//     public static void main(String[] args) {
//         int input1 = 12;
//         int input2 = 1313;
//         int input3 = 122;
//         int input4 = 678;
//         int input5 = 898;

//         int password = generatePassword(input1, input2, input3, input4, input5);
//         System.out.println(password);
//     }
// }

public class password {
    public static int generatePassword(int input1, int input2, int input3, int input4, int input5) {
        int[] numbers = { input1, input2, input3, input4, input5 };
        int maxUnstable = Integer.MIN_VALUE;
        int minUnstable = Integer.MAX_VALUE;
        int unstableCount = 0;

        for (int number : numbers) {
            if (isUnstable(number)) {
                unstableCount++;
                maxUnstable = Math.max(maxUnstable, number);
                minUnstable = Math.min(minUnstable, number);
            }
        }

        if (unstableCount == 0) {
            return 0; // No unstable numbers, return 0 as password
        }

        return maxUnstable + minUnstable;
    }

    public static boolean isUnstable(int number) {
        String numberString = String.valueOf(number);
        int[] digitCount = new int[10];

        for (char digit : numberString.toCharArray()) {
            digitCount[digit - '0']++;
        }

        boolean isStable = true;
        for (int count : digitCount) {
            if (count > 0 && count != digitCount[numberString.charAt(0) - '0']) {
                isStable = false;
                break;
            }
        }

        return !isStable;
    }

    public static void main(String[] args) {
        int input1 = 12;
        int input2 = 1313;
        int input3 = 122;
        int input4 = 678;
        int input5 = 898;

        int password = generatePassword(input1, input2, input3, input4, input5);
        System.out.println("Password: " + password);
    }
}
