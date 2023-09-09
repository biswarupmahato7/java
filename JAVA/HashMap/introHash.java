package HashMap;

import java.util.HashMap;

public class introHash {
    public static void main(String[] args) {
        HashMap <String, Integer> mp=new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Biswarup", 21);
        mp.put("Bipul", 21);
        mp.put("Elives", 21);

        System.out.println(mp.entrySet());

        mp.put("Biswarup", 7);
       System.out.println( mp.containsKey("Elives"));
       System.out.println( mp.containsKey("Rahul"));
       

        //add a new entry if does't exists
        mp.putIfAbsent("Rahul", 112);
        mp.remove("Akash");
        
        System.out.println(mp.entrySet());

        //Traverse HashMap

        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }

        for(var key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
    }

  
    
}
