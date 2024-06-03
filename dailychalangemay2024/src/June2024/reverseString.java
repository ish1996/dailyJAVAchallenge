package June2024;

public class reverseString {

    public static void main(String[] args) {
        String s = "Hi Hello";
        //output iH olleH
        System.out.println(reverseStr(s));
    }

    private static String reverseStr(String s) {

        String[] str = s.split(" ");
        for(int i=0; i<str.length;i++)
        {
            String jst = str[i];
            for(int j=jst.length()-1 ;j>=0;j--)
            {
                System.out.print(jst.charAt(j));
            }
            System.out.print(" ");
        }

        return s;
    }
}
