package HashMap;

import java.util.HashMap;
import java.util.Scanner;

// Input l:
// listen
//Input 2:
// silent
// Output :
// true 

// Input2:
// anagram 
// grams
// Output
// False

public class anagram {
    static HashMap<Character,Integer> makeFreqMao (String s){
        HashMap<Character,Integer> freq =new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch =s.charAt(i);
            if(!freq.containsKey(ch)){
                freq.put(ch, 1);
            }else{
                int currFreq=freq.get(ch);
                freq.put(ch,currFreq+1);
            }

        }
        return freq;

    }
    public static boolean isAnagram(String str1,String str2){
        int s1 = str1.length();
        int s2 = str2.length();
        
        if(s1!=s2)  return false;
        HashMap<Character,Integer> mp1=makeFreqMao(str1);
        HashMap<Character,Integer> mp2=makeFreqMao(str2);

        return mp1.equals(mp2);

            
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter both the String: ");

        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isAnagram(str1, str2));

    }
    
}
