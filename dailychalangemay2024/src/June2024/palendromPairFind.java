package June2024;

import java.sql.SQLOutput;

public class palendromPairFind {

    public static void main(String[] args) {
        String[] s = {"geekf", "keeg8", "or",
                "keeg", "abc", "bc"};
        System.out.println(fun1(s));
    }

    private static String fun1(String[] s) {
        String output = "";
        for (int i = 0; i <= s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {

                String mix = s[i]+s[j];

                if(isPalindrom(mix)) {
                    output = s[i] +" "+ s[j];
                }
            }
        }
        return output;
    }

    private static boolean isPalindrom(String mix) {

        boolean flag = true;
        for(int i=0; i<mix.length()/2; i++)
        {
            if(mix.charAt(i) != mix.charAt(mix.length()-i-1))
            {
                flag = false;
            }
        }
        return flag;
    }
}
