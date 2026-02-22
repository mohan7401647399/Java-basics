
import java.util.Arrays;
import java.util.List;


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




		Write a program to find the first non-repeating character in a string.
		
		import java.util.LinkedHashMap;
		import java.util.Map;

		public class Problems {
			public static void main(String[] args) {
				String str = "swiss";
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

		for(char c : map.keySet()){
			if(map.get(c) == 1) {
				System.out.println("Non-repeat char is " + c);
				break;
			}
		}
	}
}




		Write a program to find the occurrence of each character in a string.

import java.util.HashMap;
import java.util.Map;

public class Problems {

    public static void main(String[] args) {
        String str = "Hello";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }
}



		Write a program to check if a person is eligible to vote (age >= 18).
 
public class Problems {

    public static void main(String[] args) {
        int age = 30;

        if (age >= 18) {
            System.out.println("Valid for Vote");
        } else {
            System.out.println("Not valid for vote");
        }
    }
}





		Write a program to count the number of words in a sentence.
 
public class Problems {

    public static void main(String[] args) {
        String str = "Hello world";

        int count = str.trim().split("").length;
        System.out.println(count);
    }
}






		Write a Java program to reverse a string.

 
public class Problems {

    public static void main(String[] args) {
        String str = "Hello world";

        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("StringBuffer -> " + reverseStr);
        //	or
        String reverseString = new StringBuilder(str).reverse().toString();
        System.out.println("StringBuilder -> " + reverseString);
    }
}






		Write a program to sort a list of integers.

 
public class Problems {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(5, 1, 3, 4);
        Collections.sort(lists);

        System.out.println(lists);
    }
}








		Write a program to demonstrate thread pooling using ExecutorService.

 
public class Problems {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            es.execute(() -> System.out.println(Thread.currentThread().getName()));
        }
        es.shutdown();
    }
}






		Write a program to find triplets in an array whose sum is zero.


 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1, r = arr.length - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }
}





		Write a program to remove duplicate elements from an array.

 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3};

        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        System.out.println(set);
    }
}





		Write a program to check if a string is a palindrome.

 
public class Problems {

    public static void main(String[] args) {
        String str = "madam";

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(rev));
    }
}






		Write a program to find the factorial of a number using recursion.
 
public class Problems {

    static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {

        int result = fact(5);

        System.out.println(result);
    }
}




		Write a program to check if a number is prime.
 
public class Problems {

    public static void main(String[] args) {
        int n = 7;
        boolean prime = n > 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        System.out.println(prime);
    }
}




		Write a program to print Fibonacci series up to n terms.

 
public class Problems {

    public static void main(String[] args) {
        int a = 0, b = 1, n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}





		Write a program to swap two numbers without using a third variable.

 
public class Problems {

    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("a -> " + a + " b -> " + b);
        a = a + b;
        System.out.println("a -> " + a + " b -> " + b);
        b = a - b;
        System.out.println("a -> " + a + " b -> " + b);
        a = a - b;
        System.out.println("a -> " + a + " b -> " + b);
    }
}






		Write a program to check if two strings are anagrams.
 
public class Problems {

    public static void main(String[] args) {
        char[] a = "listen".toCharArray();
        char[] b = "silent".toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}





		Write a program to implement binary search.
 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7};

        int key = 5;

        int idx = Arrays.binarySearch(arr, key);

        System.out.println(idx);
    }
}






		Write a program to implement linear search.

 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int key = 5;

        for (int i = 0; i < arr.length; i++) {
            String result = (arr[i] == key) ? "Key found at the index " + i : "Key Not Found " + key;
            if (!result.isEmpty()) {
                System.out.println(result);
                break;
            }
        }
    }
}






		Write a program to find the largest element in an array.

 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {2, 9, 1, 7, 5};

        int max = 0;

        for (int a : arr) {
            max = Math.max(max, a);
        }

        System.out.println(max);
    }
}






		Write a program to reverse an array.

 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {6, 1, 7, 3, 9, 2};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}





		Write a program to implement bubble sort.
 
import java.util.Arrays;

public class Problems {

    public static void main(String[] args) {
        int[] arr = {6, 1, 9, 4, 7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}







        Write a program to implement selection sort.

 
import java.util.Arrays;

public class Problems {

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 6, 4, 9};

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}






        Write a program to implement insertion sort.

 
import java.util.Arrays;

public class Problems {

    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 7, 6, 4};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}







    Write a program to remove whitespaces from a string.

 
public class Problems {

    public static void main(String[] args) {
        String str = "Hello world ";

        System.out.println(str.replaceAll("\\s", ""));
    }
}








        Write a program to find duplicate elements in an array.
 
import java.util.HashSet;
import java.util.Set;

public class Problems {

    public static void main(String[] args) {
        int[] arr = {6, 1, 6, 9, 2, 9};

        Set<Integer> set = new HashSet<>();

        for (int a : arr) {
            if (!set.add(a)) {
                System.out.println(a);
            }
        }
    }
}










        Write a program to merge two sorted arrays.

 
public class Problems {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] c = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, c, 0, arr1.length);
        System.arraycopy(arr2, 0, c, arr1.length, arr2.length);
        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}








        Write a program to find common elements in two arrays.

 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problems {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 5));

        set1.retainAll(set2);

        System.out.println(set1);
    }
}








        Write a program to calculate the sum of digits of a number.
 
public class Problems {

    public static void main(String[] args) {
        int n = 123, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }
}









        Write a program to find the second largest number in an array.

 
public class Problems {

    public static void main(String[] args) {
        int[] arr = {7, 1, 6, 9, 4};

        Arrays.sort(arr);

        System.out.println("Second Largents Num is " + arr[arr.length - 2]);
    }
}





        Write a program to find GCD of two numbers.
 
public class Problems {

    public static void main(String[] args) {
        int a = 12, b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}






        Write a program to find LCM of two numbers.
 
public class Problems {

    public static void main(String[] args) {
        int a = 12, b = 18;
        int gcd = a, temp = b;

        while (temp != 0) {
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}







        Write a Java 8 program to filter a list of employees whose salary is less than 5000.
 
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " " + salary;
    }
}

public class Problems {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mohan", 50000),
                new Employee("John", 40000),
                new Employee("Alex", 60000)
        );
        List<Employee> filteredEmployee = employees.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());

        filteredEmployee.forEach(System.out::println);
    }
}







        Write a Java 8 program to find the maximum salary from a list.
 
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " " + salary;
    }
}

public class Problems {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mohan", 50000),
                new Employee("John", 40000),
                new Employee("Alex", 60000)
        );
        OptionalDouble maxSalary = employees.stream().mapToDouble(Employee::getSalary).max();
        maxSalary.ifPresent(System.out::println);
    }
}







        Write a Java 8 program to group elements of a list by a certain property (e.g., department).
 
class Employee {

    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public String toString() {
        return name;
    }
}

public class Problems {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mohan", "HR"),
                new Employee("John", "Admin"),
                new Employee("Alex", "HR")
        );
        Map<String, List<Employee>> grouped = employees.stream().collect(Collectors.groupingBy(Employee::getDept));

        grouped.forEach((key, value) -> System.out.println(key + " " + value));
    }
}









        Write a Java 8 program to convert a list of strings to uppercase.
 
public class Problems {

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Java", "Python");
        List<String> upper = lists.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upper);
    }
}





        Write a Java 8 program to count character occurrences in a string using Streams.
 
public class Problems {

    public static void main(String[] args) {
        String s = "hello";

        Map<Character, Long> freq = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freq);
    }
}







        Use Java 8 Optional to avoid NullPointerException.
 
public class Problems {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value not present"));
    }
}




        Use lambda expression to sort a list.
 
public class Problems {

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("ahmedabad", "calcuta", "bombay");
        lists.sort((a, b) -> a.compareTo(b));
        System.out.println(lists);
    }
}







        Use method reference and constructor reference in Java 8.
 
public class Problems {

    public static void main(String[] args) {
        //  Method reference
        List<String> lists = Arrays.asList("mohan", "john", "alex");
        lists.forEach(System.out::println);

        //  Constructor reference
        Supplier<List<String>> supplier = ArrayList::new;
        List<String> newList = supplier.get();
    }
}






        Use Java 8 Collectors.toMap() to convert a list to a map.
 
class Employee {

    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public String toString() {
        return name;
    }
}

public class Problems {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mohan", "HR"),
                new Employee("John", "Admin"),
                new Employee("Alex", "HR")
        );
        Map<String, String> nameDeptMap = employees.stream().collect(Collectors.toMap(e -> e.name, e -> e.dept));
        System.out.println(nameDeptMap);
    }
}









        Use flatMap to flatten nested lists in Java 8.
 
public class Problems {

    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

        List<String> flat = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(flat);
    }
}







        Write a Java 8 program to find the average of a list of numbers.
 
public class Problems {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1, 3, 7, 9, 4);

        OptionalDouble avg = lists.stream().mapToInt(Integer::intValue).average();

        avg.ifPresent(System.out::println);
    }
}








        Write a Java 8 program to join a list of strings with a delimiter.
 
public class Problems {

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("apple", "banana", "orange");

        String joined = lists.stream().collect(Collectors.joining(", "));

        System.out.println(joined);
    }
}







        Write a Java 8 program to remove duplicates from a list using Streams.
 
public class Problems {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1, 7, 6, 9, 7, 2, 1);

        List<Integer> distinctLists = lists.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctLists);
    }
}






        Write a Java 8 program to sort a map by values.
 
public class Problems {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mohan", 50000);
        map.put("jack", 30000);
        map.put("Roman", 80000);

        LinkedHashMap<String, Integer> sortedMaps = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMaps);
    }
}






        Write a Java 8 program to sort a list of objects using multiple fields.
 
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Problems {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mohan", 50000),
                new Employee("John", 40000),
                new Employee("Alex", 60000)
        );
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));

        employees.forEach(System.out::println);
    }
}







        Write a Java 8 program to get current date and time using LocalDateTime.
 
public class Problems {

    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();

        System.out.println(timeNow);
    }
}








        Write a Java 8 program to calculate the difference between two dates.
 
public class Problems {

    public static void main(String[] args) {
        LocalDate l1 = LocalDate.of(2025, 12, 1);
        LocalDate l2 = LocalDate.of(2025, 12, 10);

        long daysGap = ChronoUnit.DAYS.between(l1, l2);
        System.out.println(daysGap);
    }
}









        Write a Java 8 program to convert a list of integers to their squares.
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problems {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList( 5, 3, 7, 2);
        List<Integer> squares = lists.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(squares);
    }
}






        Write a Java 8 program to partition a list based on a predicate.
 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problems {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partioned = lists.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partioned);
    }
}







        Write a Java 8 program to check if a list contains a given string ignoring case.
 
public class Problems {

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Java", "Python", "Javascript", "C++");
        String str = "Java";
        //  Any Match
        boolean AnyContains = lists.stream().anyMatch(s -> s.equalsIgnoreCase(str));
        System.out.println(AnyContains);
        //  All Match
        boolean AllContains = lists.stream().allMatch(s -> s.equalsIgnoreCase(str));
        System.out.println(AllContains);
    }
}
*/



