
//Remove Special character from a string 

package String;

// public class removeSpc_char {

//     public static void main(String[] args) {

//         String str = "$ja!va$&st%ar";

//         // Approach 1
//         String planString = str.replaceAll("[^a-zA-Z0-9]", ""); //  remove all characters from a string except for alphanumeric characters (letters and digits).
//         System.out.println(planString);

//     }

// }


//Remove Space

public class removeSpc_char{
    public static void main(String[] args) {
        String str= " ja va st a r";

        //String trimerString = str.trim(); // trim method is use for remove the space in start and end of the String
        String planeString = str.replaceAll("\\s","");  //the regular expression \\s matches any whitespace character (including spaces, tabs, and newlines). The replaceAll method replaces all occurrences of whitespace characters with an empty string, effectively removing all spaces from the original string.
        System.out.println(planeString);
    }

}
