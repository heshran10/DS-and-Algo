package Recursion;


//print x to power n
//x into xn-1; 


public class xpown {


    public static int power(int x, int n) {

        if(n==0){
            return 1;
        }

        int pow = power(x, n-1);
        int fn = x * pow;
        return fn;
        
    }
    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }
}

// Commit timestamp: 2024-06-20 16:09:00