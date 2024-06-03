package June2024;

public class secondandthridlargest {

    public static void main(String[] args) {
        int[] i = {4,3,5,7,6,2,0,7,9,8,0,3,2,3};
        //output iH olleH
        largest(i);
    }

    private static void largest(int[] n) {

        int firsthigh = 0;
        int secondhigh = 0;
        int thirdhigh = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > firsthigh) {
                thirdhigh = secondhigh;
                secondhigh = firsthigh;
                firsthigh = n[i];
            }
            else if(n[i]>secondhigh)
            {
                thirdhigh = secondhigh;
                secondhigh = n[i];
            }
            else if(n[i]>thirdhigh)
            {
                thirdhigh = n[i];
            }
        }
        System.out.println("thirdhigh "+thirdhigh+" secondhigh "+secondhigh + " firsthigh "+firsthigh);
    }
}
