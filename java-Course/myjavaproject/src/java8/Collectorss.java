/*
    
    Collectors is a utility class in the java.util.stream package.
It provides factory methods to create common collectors which are used with the Stream API to process data and collect the result into a desired form like List, Set, Map, String, etc

	| What | Used to convert Stream result back into List, Set, Map, etc. |
    | Why | For terminal operation to gather processed elements. |
    | When | At the end of stream chain. |
    | How | .collect(Collectors.toList()) |


    Collectors help in:

        Converting stream elements into collections
        Grouping or partitioning data
        Summarizing statistics
        Joining strings




    package java8;
 */

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectorss {
    public static void main(String[] args) {
        // 1. Convert to List
        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println(list);
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        // 2. Convert to Set
        List<String> names = List.of("Mohan", "john", "Mohan", "Mickel");
        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Joining Strings
        String name = names.stream().collect(Collectors.joining(" hi "));
        System.out.println(name);

        // 4. Summing & Averaging
        int sum = list.stream().collect(Collectors.summingInt(n -> n));
        System.out.println(sum);
        double avg = list.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println(avg);
    }
}
