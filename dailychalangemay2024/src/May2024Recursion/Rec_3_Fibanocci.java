package May2024Recursion;

public class Rec_3_Fibanocci {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibanocciFun(n));
    }

    private static int fibanocciFun(int n) {

        if (n==1)
        {
            return 0;
        }
        if (n==2)
        {
            return 1;
        }

        return fibanocciFun(n-1)+fibanocciFun(n-2);

    }
}
