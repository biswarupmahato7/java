package ArrayList;
import java.util.Collections;

import java.util.ArrayList;

public class reverse {

    // public static void reverseList(ArrayList<Integer> list) {
    //     int i = 0;
    //     int j = list.size()-1;

    //     while (i < j) {

    //         Integer temp = Integer.valueOf(list.get(i)); // temp=i
    //         list.set(i, list.get(j));// i=j
    //         list.set(j, temp); // j=tem

    //         i++;
    //         j--;

    //     }

    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("Before Reverse- " + list);
        //reverseList(list);
        System.out.println("After  Reverse- " + list);
        Collections.reverse(list);
        
        Collections.sort(list);
        System.out.println("Ascending Order Sorting  - " + list);
        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order Sorting  - " + list);


        ArrayList<String> str=new ArrayList<>();
        str.add("Biswarup");
        str.add("Bipul");
        str.add("Ronaldo");
        str.add("Rahul");
        str.add("Harshit");

        Collections.sort(str);
        System.out.println("Ascending Order Sorting  - " + str);
        Collections.sort(str,Collections.reverseOrder(null));
        System.out.println("Descending Order Sorting  - " + str);





    }

}
