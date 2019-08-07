package codewars;

import java.util.HashMap;
import java.util.Map;

public class PrintStringPairs {

    public static void main(String[] args) {
        printPairs("abc, cdb, cba, ssfsd, bdc, addfdfd");
    }


    //Print pairs of Strings from a list which are reverse of each other.
    //Sting str = "abc, cdb, cba, ssfsd, bdc, addfdfd";
        //abc -> cba
        //cdb -> bdc

    public static void printPairs (String str) {
        String [] str2 = str.split(", ");
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < str2.length; i++) {
            String reverse = "";
            for (int j = str2[i].length()-1; j >= 0; j--){
                reverse = reverse + str2[i].charAt(j);
            }

            for (int k = 0; k < str2.length; k++) {
                if (map.containsKey(reverse))
                    break;
                if (reverse.equals(str2[k])) {
                    map.put(str2[i], reverse);
                }
            }
        }
        for (Map.Entry<String, String> ech : map.entrySet()){
            System.out.println(ech);
        }
    }

}
