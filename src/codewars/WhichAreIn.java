package codewars;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class WhichAreIn {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
        System.out.println(Arrays.toString(inArray2(new String[]{"arp", "abr", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));

    }

            //Which are in?
    /*
        * Given two arrays of strings a1 and a2 return a sorted array R in lexicographical order of the strings of a1 which are
        * substrings of strings of a2.
        *
        * #Example 1: a1 = ["arp", "live", "strong"]
        * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        * returns ["arp", "live", "strong"]
        *
        * #Example 2: a1 = ["tarp", "mice", "bull"]
        * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        * returns []
        *
        *       Notes:
        * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
        * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
        * Beware: r must be without duplicates.
        * Don't mutate the inputs.
     */

                //#1
    public static String[] inArray (String[] a1, String[] a2) {

        SortedSet <String> set = new TreeSet<>();

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a2[j].contains(a1[i]))
                    set.add(a1[i]);
            }
        }
        return set.toArray(new String[0]);
    }


                //#2 using stream
    public static String[] inArray2 (String[] a1, String[] a2) {
        return Arrays.stream(a1)
                .filter(str -> Arrays.stream(a2).anyMatch(s -> s.contains(str)))
                .sorted()
                .toArray(String[]::new);
    }
}
