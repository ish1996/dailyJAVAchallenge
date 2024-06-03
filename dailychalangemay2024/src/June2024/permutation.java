package June2024;

public class permutation {

    public static void main(String[] args) {
        String n="abc";

        permutate(n, 0, n.length()-1);
    }

    private static void permutate(String n, int start, int end) {
        if(start==end)
        {
            System.out.println(n);
        }
        else
        {
            for (int i =start;i<=end;i++)
            {
                n = swap(n,start,i);
                permutate(n,start+1,end);
                n=swap(n,start,i);
            }
        }
    }

    private static String swap(String n, int i, int j) {

        char temp;
        char[] charArray = n.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
