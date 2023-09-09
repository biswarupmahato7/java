package String;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        //String str2=sc.next();

        //s1>s2 =+ve
        // s1==s2 =0
        // s1<s2=-ve

        // if(str1.compareTo(str2)==0){
        //     System.out.println("equal");

        // }
        // else{
        //     System.out.println("not equal");
        // }

        //System.out.println(str1.substring(0, 4));

        char charArray[]=str1.toCharArray();
        for(int i=charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }

        //aPPROACH
        for(int i=str1.length()-1;i>=0 ;i--){
            System.out.print(str1.charAt(i));
        }

        //Approach 3 String Buffer 
        StringBuffer sb= new StringBuffer(str1);
        System.out.println(sb.reverse());

        //APPROACH 4 String Builder 
        System.out.println("");

        StringBuilder sB=new StringBuilder(str1);
        System.out.println(sB.reverse());




    }
    
}

 
