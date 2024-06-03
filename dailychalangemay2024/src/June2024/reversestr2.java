package June2024;

public class reversestr2 {

    public static void main(String[] args) {
        String s = "Hi Hello";
        System.out.println(reverseStr(s));
    }

    private static String reverseStr(String s) {

       char[] chars = s.toCharArray();
       String new1 ="";
       for(int i=chars.length-1;i>=0;i--)
       {
           new1=new1+chars[i];
       }

        return new1;
    }
}
