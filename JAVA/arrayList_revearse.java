import java.util.ArrayList;
import java.util.Collections;

public class arrayList_revearse {
    //static void reverseList(ArrayList<Integer>list){
        // int i=0;
        // int j=list.size()-1;

        // while(i<j){
        //     Integer temp=Integer.valueOf(list.get(i)); // int temp =a;
        //     list.set(i,list.get(j));                   // a=b;
        //     list.set(j,temp);                          //b=temp;

        //     i++;
        //     j--;
        //}
    //}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(22);
        list.add(4);
        System.out.println("Original List "+list);
        Collections.reverse(list);
        System.out.println("Reverse list is "+list);
        Collections.sort(list);
        //revears(list);
        System.out.println("Assending Order "+list);
        Collections.sort(list,Collections.reverseOrder(null));
        System.out.println("Desc Order "+list);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Biswarup");
        l1.add("Mahato");
        l1.add("Here");
        System.out.println("Og"+l1);
        Collections.sort(l1);
        System.out.println("Sorted"+l1);
        
        
    }
    
}
