package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDup_char {
    public static void main(String[] args) {
        String str = "Programming";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int idx = str.indexOf(ch, i + 1); //return the index position || [ int indexOf(int ch, int fromIndex)-- It returns the index position for the given char value and from index]
            if (idx < 0) { 
                sb.append(ch);
            }

        }
        System.out.println(sb);

        //another approach

        char arr[]=str.toCharArray();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<str.length();i++){
            boolean repetend=false;
            for(int j=i+1;j<str.length();j++){
                if(arr[i]==arr[j]){
                    repetend=true;
                    break;
                }
            }
            if(!repetend){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb2);

        //Approach 3

        StringBuilder sb3 = new StringBuilder();
        //Set<Character> set =new LinkedHashSet<>();
        Set<Character> set =new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c:set){
            sb3.append(c);
        }
        System.out.println(sb3);


    }

}
