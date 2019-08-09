package codewars;

import java.util.HashMap;
import java.util.Map;

public class DetectPangram {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog.")); //true
        System.out.println(check("The quick brown ")); //false
        System.out.println(check("rwtg yh mnold jfpiq acs")); //false
        System.out.println(check("3 3 4 33")); //true
        System.out.println(check("3")); //true
    }

                //Detect Pangram
        //A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog"
        //is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
        //Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

                //#1
    public static boolean check (String sentence) {
        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        char [] str = sentence.toLowerCase().toCharArray();
        Map <Character, String> map = new HashMap<>();

        if (str.length == 0) return true;
        if (str.length < 26) return false;
        for (Character x : str) map.put(x, "");
        return true;

    }
                //#2
    public boolean check2(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
}
