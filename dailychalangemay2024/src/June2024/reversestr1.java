package June2024;

public class reversestr1 {

    public static void main(String[] args) {
        String s = "Hi Hello";
        System.out.println(reverseStr(s));
    }

    private static String reverseStr(String s) {

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return  sb.toString();
    }
}
