package June2024;

public class sort012 {

    public static void main(String[] args) {
        int[] n={0,1,2,0,2,2,2,1,1,0};

        sort(n);
    }

    private static void sort(int[] n) {

        int[] n1 = new int[n.length];

        int zeros = countN(n,0);int one = countN(n,1);int two = countN(n,2);
        System.out.println(zeros+" "+one+ " "+two);
        for(int i=0; i<zeros;i++)
        {

            n1[i] = 0;
        }

        for(int i=zeros; i<(zeros+one);i++)
        {

            n1[i] = 1;
        }

        for(int i=zeros+one; i<(zeros+one+two);i++)
        {

            n1[i] = 2;
        }
        for(int i=0; i<n1.length; i++)
        {
            System.out.println(n1[i]);
        }
    }
    private static int countN(int[] n, int N) {
        int count=0;
        for (int j : n) {
            if (j == N)
                count = count + 1;
        }
        return count;
    }
}
