package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
 
	Separate Odd and Even Numbers
	
public class Problems {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(2);
		listOfIntegers.add(3);
		listOfIntegers.add(4);
		listOfIntegers.add(5);
		listOfIntegers.add(6);
		listOfIntegers.add(7);
		System.out.println("Total lists -> " + listOfIntegers);
		
		Map<Boolean, List<Integer>> OddEvenNums = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("Even nums -> " + OddEvenNums.get(true));
		System.out.println("Odd nums -> " + OddEvenNums.get(false));
	}
}




	Frequency Of Each Characters In String
	
	
public class Problems{
	public static void main(String[] args) {
		String name = "I am a Java developer";
		Map<Character, Long> result =  name
				.toLowerCase()
				.chars()
				.filter(c -> c != ' ')
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}
}






	Sort The List In Reverse Order
	
public class Problems{
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		lists.add(1);
		lists.add(2);
		lists.add(3);
		lists.add(4);
		
		System.out.println(lists);
		lists.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}






	Print Multiples Of 5 From The List

public class Problems{
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		lists.add(5);
		lists.add(1);
		lists.add(1);
		lists.add(4);
		lists.add(10);
		lists.add(50);
		lists.add(60);
		lists.add(20);
		
		System.out.println(lists);
		
		lists.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
	}
}





	Merge Two Unsorted Arrays Into Single Sorted Array	


public class Problems {
	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 6 };
		int[] b = { 6, 7, 9, 3 };

		IntStream.concat(Arrays.stream(a), Arrays.stream(b)).forEach(System.out::println);
		
		IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(System.out::println);
		
		int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(result));
	}
}





	Merge Two Unsorted Arrays Into SIngle Sorted Array Without Duplicates


public class Problems{
	public static void main(String args[]) {
		System.out.println("hi");
		int[] a = { 2, 1, 3, 6 };
		int[] b = { 6, 7, 9, 3 };
		
		int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(result));
	}
}





	Three Max Numbers From The List

public class Problems {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		lists.add(5);
		lists.add(1);
		lists.add(6);
		lists.add(4);
		lists.add(7);
		lists.add(2);
		lists.add(0);
		System.out.println(lists.toString());

		lists.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}





		Three  Min Numbers From The List


public class Problems {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		lists.add(5);
		lists.add(1);
		lists.add(6);
		lists.add(4);
		lists.add(7);
		lists.add(2);
		lists.add(0);
		System.out.println(lists.toString());

		lists.stream().sorted().limit(3).forEach(System.out::println);

	}
}
 */



