package codewars;

import java.util.*;

public class _Collection_INFO {

    public static void main(String[] args) {

                                    //LIST
        /*
            * Store list of objects
            * Duplicates are allowed
            * Objects remain in order
            * Elements are indexed via an integer
            * Checking for particular item in list is slow
            * Looking an item up BY is fast
            * Iterating through list is relatively fast
            * Note: you can sort list if you want to
         */

        // If you only add or remove items at end of list, use ArrayList
        List <String> list1 = new ArrayList<>();
        list1.toArray();

        // Removing or adding items elsewhere in the list?
        List <String> list2 = new LinkedList<>();
            list2.add("one");
            list2.add("two"); // will add element in the end of the list
            list2.add(0, "first"); // will add element on position 0 and moved all elements to the left





                                    //SET
        /*
            * Only store unique values
            * Great for removing duplicates
            * Not indexed, unlike lists
            * Very fast to check if a particular object exists
            * If you want to use own object, you must implement hashCode() and equals()
         */

        // Order is unimportant and OK if it changes?
        // HashSet is not ordered
        Set <String> set1 = new HashSet<>();

        // Sorted is natural order? use TreeSet
        // (1,2,3...., a,b,c.... etc)
        Set <String> set2 = new TreeSet<>();

        //Elements remain in order they were added
        Set <String> set3 = new LinkedHashSet<>();




                                    //MAP
        /*
            * Key : Value pairs
            * Like lookup tables
            * Retrieving a value by key is fast
            * Iterating over maps is slow
            * If you want to use your own objects as key, you must implement hashCode() and equals()
         */

        // Keys not in any particular order, and order liable to change
        Map <String, String> map1 = new HashMap<>();

        // Key sorted in natural order (1,2,3...., a,b,c.... etc)
        Map <String, String> map2 = new TreeMap<>();

        // Keys remain in order added
        Map <String, String> map3 = new LinkedHashMap<>();


        /*
            * There are also the SortedSet and SortedMap interfaces

         */

    }
}
