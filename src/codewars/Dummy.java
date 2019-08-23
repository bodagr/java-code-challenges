package codewars;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Dummy {

    public static void main(String args[]) {

        SortedSet <String> set = new TreeSet<>();
        set.add("c");
        set.add("b");
        set.add("w");
        set.add("a");

        set.forEach(System.out::println);


    }

}
