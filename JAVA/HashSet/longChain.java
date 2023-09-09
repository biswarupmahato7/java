package HashSet;

import java.util.HashSet;

public class longChain {
   static int longestConssecutive(int arr[]){
    HashSet<Integer>st= new HashSet<>();
    for(int num:arr){
        st.add(num);
    }
    int maxStreak=0;

    for(int num:st){ //check in set
        if(!st.contains(num-1)){
            int currentNum=num;
            int currentStreak=1; //Length of current Consecutive Sequence
            while(st.contains(currentNum+1)){ //Do it till CurrentNumber+1 contains in Set
                currentStreak++;
                currentNum++;

            }
            maxStreak=Math.max(maxStreak,currentStreak); //It returns Which is max out of this


        }
    }
    return maxStreak;


   }

    public static void main(String[] args) {
        int arr[]={99,1,100,4,200,1,2,2,3};
        System.out.println(longestConssecutive(arr));
        
    }
    
}
