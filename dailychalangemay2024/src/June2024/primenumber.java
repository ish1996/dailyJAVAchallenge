package June2024;

public class primenumber {

    public static void main(String[] args) {
        int n=10;

       primes(n);
    }

    private static void primes(int n) {
        for(int i=1;i<=n;i++)
        {
            boolean flag=false;
            for(int j=2; j<=i/2; j++)
            {
                if(i%j==0) {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.println(i);
            }
        }
    }
}
