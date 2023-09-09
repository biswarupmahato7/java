package Accenture;
import java.util.Scanner;

public class ac_Q7 {
    static String mergeString(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int mergedLen = len1 + len2;
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < mergedLen; i++) {
            if (i % 2 == 0) {
                sb.append(s1.charAt(i / 2));
            } else {
                sb.append(s2.charAt(len2 - (i / 2) - 1));
            }
        }
    
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String s1 = sc.next();
        System.out.println("Enter string 2: ");
        String s2 = sc.next();

        String merged = mergeString(s1, s2);
        System.out.println("Merged String: " + merged);

       
    }
}

