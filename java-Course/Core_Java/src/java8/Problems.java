package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
 */