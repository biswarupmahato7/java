package HashMap;

import java.util.*;

public class isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        // Create a HashMap to store character mappings
        HashMap<Character, Character> mp = new HashMap<>();
        
        // Check if the lengths of the strings are different, return false if they are
        if (s.length() != t.length())
            return false;
        
        // Iterate through the characters of the strings
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i); // Current character in string s
            char chT = t.charAt(i); // Current character in string t
            
            // If character chS is already in the map
            if (mp.containsKey(chS)) {
                // Check if the mapping is consistent
                if (mp.get(chS) != chT)
                    return false; // If not consistent, strings are not isomorphic
            } else if (mp.containsValue(chT)) {
                return false; // If character chT is already mapped, but not to chS, return false
            } else {
                mp.put(chS, chT); // Create a new mapping
            }
        }
        
        // All character mappings are consistent, strings are isomorphic
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s = sc.next();
        String t = sc.next();
        System.out.println("Strings are isomorphic: " + isIsomorphic(s, t));
    }
}
