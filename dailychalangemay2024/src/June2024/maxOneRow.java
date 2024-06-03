package June2024;

public class maxOneRow {

    public static void main(String[] args) {
        int mat[][] = { {0, 0, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int R = mat.length;
        int C = mat[1].length;

        System.out.print("Index of row with maximum 1s is " + rowWithMax1s(mat,R,C));
    }

    private static int rowWithMax1s(int[][] mat, int r, int c) {
        int max=0;
        int output =0;
        for(int i=0; i<r;i++)
        {
            int count1 = 0;
            for(int j=0; j<c;j++)
            {
                if(mat[i][j]==1)
                {
                    count1=count1+1;
                }
            }
            if(count1>max)
            {
                max=count1;
                output = i;
            }
        }
        return output;
    }
}
