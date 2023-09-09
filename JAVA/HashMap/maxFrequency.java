package HashMap;

import java.util.HashMap;
import java.util.Map;

public class maxFrequency {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,4,4,3,4,4,7};
        Map<Integer,Integer> freq= new HashMap<>();
        for(int element:arr){
            if(!freq.containsKey(element)){
                freq.put(element, 1);
            }else{
                freq.put(element,freq.get(element)+1);
            }
        }
        System.out.println("Frequency Map is ");
        System.out.println(freq.get(2));
        System.out.println(freq.entrySet());
        int maxFrequency=0;
        int ansKey=0;

        for(var e:freq.entrySet()){
            if(e.getValue()>maxFrequency){
                maxFrequency=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(ansKey);

    }
    
}
