package MAY2024;

public class May14SevenBoomArray {

    private static void result(int[] input)
    {
        boolean flag=false;
        for(int i : input)
        {
            if(String.valueOf(i).contains("7"))
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("SEVEN BOOM");
        }
        else
        {
            System.out.println("not found");
        }
    }
    public static void main(String[] args) {
       int [] input = {1, 2, 3, 0, 5, 006, 970};
       result(input);
    }

}
