package codewars;

import java.util.StringTokenizer;

public class ReverseWordsWithoutSplitMethod {

    public static void main(String[] args) {
        reverse("This is a dog");
    }

    // Given a String with spaces, write Java code to reverse the order of words in the String,
    // without relying on the built-in String library's split methods
    // (write your own split/tokenizing code). (e.g. given "This is a dog", output "dog a is This")

    public static void reverse (String str) {
            // #1
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        String [] strSet = new String[stringTokenizer.countTokens()];
        int x = 0;
        while (stringTokenizer.hasMoreTokens()) {
            strSet[x] = stringTokenizer.nextToken();
            ++x;
        }
        for (int k = strSet.length-1; k >= 0; k--) {
            System.out.print(strSet[k] + " ");
        }

        System.out.println();

                // #2
        int length = str.length()-1;
        int pos = length+1;
        for (int i = length; i >= 0; i--) {
            if (str.charAt(i) == ' ' || i == 0) {
                System.out.print(str.substring(i, pos).trim() + " ");
                pos = i;
            }
        }
    }

}
