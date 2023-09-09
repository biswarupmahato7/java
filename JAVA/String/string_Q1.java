// Given a string, the task is to toggle all the characters 
// of the string i.e to convert Upper case to Lower case
// and vice versa.

// Input - Physics
// Output - pHYSics

package String;

import java.util.*;

public class string_Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        //toggle
        for(int i=0;i<str.length();i++){

            // check alphabet is Small or Capital 

            boolean flag=true; // true -capital

            char ch =str.charAt(i); //fetch the Character

            if(ch==' ' || Character.isDigit(ch) ) continue;  //The method Character.isDigit(ch) returns true if the character ch represents a digit (0-9) and false otherwise. It can be used to check if a character is numeric or not.

            int asci=(int)ch;  //convert the variable ch to an integer type
            if(asci>=97){ // Check asci value is grater or equal to 97 then flag == false
                flag=false; //Small 
            }
            if(flag==true){
                asci+=32;
                char dh=(char)asci; //integer back into a character
                str.setCharAt(i, dh); //set it in index i
            }else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }

        }
        System.out.println(str);
        
    }

}
