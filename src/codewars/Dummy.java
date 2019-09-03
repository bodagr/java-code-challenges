package codewars;

import java.util.*;
import java.util.stream.Collectors;

public class Dummy {

    public static void main(String args[]) {

        String inp = "Hello my little friend";
        StringTokenizer tokens = new StringTokenizer(inp);
        String [] set = new String[tokens.countTokens()];

        int count = 0;
        while (tokens.hasMoreTokens()) {
            set[count] = tokens.nextToken();
            count++;
        }
        System.out.println(Arrays.toString(set));

        Arrays.stream(set).collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(x -> System.out.print(x + " "));
    }
}
