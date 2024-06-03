package June2024;

import java.util.HashMap;

public class occoranceofeachelement {

    public static void main(String[] args) {
        int[] i = {4,3,5,7,6,2,0,7,9,8,0,3,2,3};
        //output iH olleH
        occur(i);
    }

    private static void occur(int[] n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n.length;i++)
        {
            if(map.containsKey(n[i]))
            {
                map.put(n[i], map.get(n[i])+1);
            }
            else
            {
                map.put(n[i],1);
            }
        }
        System.out.println(map);
    }
}
