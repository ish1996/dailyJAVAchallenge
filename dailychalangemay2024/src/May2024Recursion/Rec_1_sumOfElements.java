package May2024Recursion;

public class Rec_1_sumOfElements {

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,60};
        System.out.println(sumOfDigits(n, n.length-1));
    }

    public static int sumOfDigits(int[] arr, int n)
    {
        int result;
        if(n==0) // base case that is arr[0]
        {
            return arr[n];
        }
        //return add big piece to small number
        result=arr[n]+sumOfDigits(arr, n-1);
        return result;
    }
}