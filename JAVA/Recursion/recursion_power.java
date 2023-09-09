package Recursion;
public class recursion_power {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1=calPower(x, n-1); //Calculate x^n-1;
        int xPown=x*xPownm1; //x* x^n-1
        return xPown;
    } 

    public static void main(String[] args) {
        int x=2,n=4;
        int ans =calPower(x, n);
        System.out.println(ans);

    }

}

// public class recursion_power {
//     static int pow(int p, int q) {
//         if (q == 0)
//             return 1;
//         return pow(p, q - 1) * p;
//     }

//     public static void main(String[] args) {
//         System.out.println(pow(5, 4));

//     }
// }


// public class recursion_power{
//     static int calPower(int n,int x){    //n==p , x==q
//         if(x==0){
//             return 1;
//         }
//         int smallPow=calPower(n, x/2);
//         if(x%2==0){
//             return smallPow*smallPow;
//         }else
//         return smallPow*smallPow*n;

//     } 
//     public static void main(String[] args) {
//         System.out.println(calPower(3, 4));
        
//     }
// }

