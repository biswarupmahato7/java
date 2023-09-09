//GIVEN AN ARRAY OF FRUIT(String) NAMES YOU ARE SUPPOSE TO SORT IT  IN LEXICOGRAPHICAL ORDER  USING THE SELECTION SORT 

// I/P-["PAPAYA","LIME","WATERMELON","APPLE","MANGO","KIWI"]  OP-["APPLE","KIWI","LIME","MANGO","PAPAYA","WATERMELON"]

public class sortQe2 {
    static void sortFruit(String fruits[]){
        int n=fruits.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[min_index])<0){
                    min_index=j;
                }

            }
            String temp=fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;

        }

    }
    public static void main(String[] args) {
        String fruits[]={"PAPAYA","LIME","WATERMELON","APPLE","MANGO","KIWI"};
        sortFruit(fruits);
        for(String str:fruits){
            System.out.print(str+" ");
        }
        
    }
    
}
