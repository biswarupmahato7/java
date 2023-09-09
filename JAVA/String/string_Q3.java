//Java Program to reverse each word in String
//i/p- I am Biswarup Mahato  O/P -I ma purawsiB otahaM

package String;

public class string_Q3 {
    public static void main(String[] args) {
        String str="I am Biswarup Mahato";
        String ans="";
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{  //when Space come 
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb.delete(0, sb.length());
                // or sb=new StringBuilder("");
            }

        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
    
}

