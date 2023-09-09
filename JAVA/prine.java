// public class prine {
    
// }
public class prine {
    public static void main(String[] args) {
        int start = 2;
        int end = 200;
        int primeCount = countPrimeNumbersInRange(start, end);
        System.out.println("Number of prime numbers in the specified range: " + primeCount);
    }

    public static int countPrimeNumbersInRange(int input1, int input2) {
        int count = 0;
        for (int number = input1; number <= input2; number++) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
