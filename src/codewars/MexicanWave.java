package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mexicanWave("hello")));
        System.out.println(Arrays.toString(mexicanWave("two words")));
        System.out.println(Arrays.toString(mexicanWave(" gap ")));

    }


                //Mexican Wave
    /*
        * 	In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
        * 	You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
        * 	1.  The input string will always be lower case but maybe empty.
        *   2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
        *   wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
     */

    public static String[] mexicanWave(String str) {
        List<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.toUpperCase().charAt(i);
            if (c == ' ') continue;
            wave.add(str.substring(0,i) + c + str.substring(i+1, str.length()));
        }

        return wave.toArray(new String[0]);
    }
}
