package May2024Recursion;

public class Rec_2_factorial {
    //3! = 3*2*1 = 6

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialFun(n));
    }

    private static int factorialFun(int n) {

        if(n==1)
        {
            return n;
        }
        return n*factorialFun(n-1);
    }

}
