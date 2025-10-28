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
import java.util.Map;
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

        // 5. Partitioning
        List<Integer> partionList = List.of(1, 6, 7, 8, 9);
        System.out.println(partionList);
        Map<Boolean, List<Integer>> partionId = partionList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partionId);

        // 6. Grouping by field
        List<User> user = List.of(new User("Mohan", 29), new User("john", 25), new User("jack", 30));

        Map<String, List<User>> groupId = user.stream().collect(Collectors.groupingBy(u -> u.name));
        System.out.println(groupId);
    }
}

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}