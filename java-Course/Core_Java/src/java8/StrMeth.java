package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Calculation {
	public abstract double add(int i);
}

interface Join {
	public abstract String get(String input);
}

interface ReturnClass {
	public abstract StrMeth get();
}

public class StrMeth {

	public static void main(String[] args) {
		m1();
		List l = Arrays.asList(13, 12, 33, 14, 4, 5);//map 
		List l1 = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(5,6,7));//flatmap
		ArrayList<Integer> al = new ArrayList<Integer>(l);
		System.out.println(al);
		System.out.println(al.stream().filter(a -> a % 2 == 0).collect(Collectors.toList()));
		System.out.println(al.stream().collect(Collectors.toSet()));

		al.stream().map(a -> a * 2).forEach(a -> System.out.println(a));
		System.out.println(al.stream().anyMatch(a->a>=8));
		System.out.println(al.stream().min(Integer::compare));
		System.out.println(al.stream().max(Integer::compare));
		System.out.println(al.stream().sorted().findFirst());
		System.out.println(al.stream().sorted().skip(al.size()-1).limit(1).findFirst());
	}

	private static void m1() {
		// 3 types of method reference ::
		// static MR, instance MR and constructor MR
		// using lambda we write a logic
		Calculation c1 = i -> i * i;
		// using method reference refer another method logic
		Calculation c2 = Math::sqrt;// static mr
		System.out.println(c1.add(16));
		System.out.println(c2.add(64));
		Join j1 = s -> s.toLowerCase();
		Join j2 = String::toLowerCase;// instance MR
		System.out.println(j1.get("HELLO"));
		System.out.println(j2.get("JAVA"));
		ReturnClass j3 = () -> new StrMeth();
		ReturnClass j4 = StrMeth::new;// constructor MR
	}
}
