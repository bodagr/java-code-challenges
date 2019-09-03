package codewars;

public class LongestPalindrome {

    public static void main(String[] args) {

        System.out.println(longestpolindrome("zyabyz"));

    }


                //Longest palindrome
    /*
        * Find the length of the longest substring in the given string s that is the same in reverse.
        * As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7.
        * If the length of the input string is 0, the return value must be 0.
        *
        * "a" -> 1
        * "aab" -> 2
        * "zzbaabcd" -> 4
     */

    public static int longestpolindrome(String str) {

        StringBuilder s = new StringBuilder(str);
        s.reverse();

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                int x = j+1;
                if (str.contains(s.substring(i, x)))
                    count++;
                else
                    break;
            }
            if (count > result)
                result = count;
        }
        return result;
    }
}
