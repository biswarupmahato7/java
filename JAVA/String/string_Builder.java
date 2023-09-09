package String;

public class string_Builder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str) ;
        
        // hello -> pelle
        str.setCharAt(0, 'm'); //Set Value
        
        System.out.println(str);
        str.append(" Biswarup");
        System.out.println(str);

        str.insert(0, 's'); //insert in 0th index
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str); //delete 0th index Char

        str.reverse();
        System.out.println(str); //Reverse the String 
    
         str.reverse();
        str.delete(2, 4);
        System.out.println(str);

    
}
}
