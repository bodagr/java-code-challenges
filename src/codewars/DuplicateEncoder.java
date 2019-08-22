package codewars;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    /*      //Duplicate Encoder
    *The goal of this exercise is to convert a string to a new string where each character in the new string is "("
    * if that character appears only once in the original string, or ")" if that character appears more than once in the original string.
    * Ignore capitalization when determining if a character is a duplicate.
    *
    *  "din"      =>  "((("
    *  "recede"   =>  "()()()"
    *  "Success"  =>  ")())())"
    *  "(( @"     =>  "))(("
    *
     */
                //#1
    public static String encode(String str) {
        str = str.toLowerCase();
        String result = "";
        Map <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
        }

        for (char c : str.toCharArray()) {
//            if (map.get(c) > 1)
//                result += ")";
//            else
//                result += "(";
            result += map.get(c) > 1 ? ")" : "(";
        }
        return result;
    }

                //#2
    public static String encode2 (String word) {
        word = word.toLowerCase();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(encode2("din"));
        System.out.println(encode("recede"));
        System.out.println(encode2("Success"));
        System.out.println(encode2("(( @"));
    }
}
