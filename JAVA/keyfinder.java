// public class keyfinder {
    
// }
public class keyfinder {
    public static int findKey(int input1, int input2, int input3) {
        int thousands = Math.min(Math.min(input1 / 1000 % 10, input2 / 1000 % 10), input3 / 1000 % 10);
        int hundreds = Math.min(Math.min(input1 / 100 % 10, input2 / 100 % 10), input3 / 100 % 10);
        int tens = Math.min(Math.min(input1 / 10 % 10, input2 / 10 % 10), input3 / 10 % 10);
        int units = Math.min(Math.min(input1 % 10, input2 % 10), input3 % 10);

        return thousands * 1000 + hundreds * 100 + tens * 10 + units;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;

        int key = findKey(input1, input2, input3);
        System.out.println("Key: " + key);
    }
}
 