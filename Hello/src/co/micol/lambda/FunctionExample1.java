package co.micol.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

	private static List<Emp> list = Arrays.asList(new Emp("홍", 20), new Emp("김", 25), new Emp("최", 5));

	public static void printString(Function<Emp, String> function) {
		for (Emp emp : list) {
			System.out.println(function.apply(emp));

		}
	}
	
	
	public static void printInt(ToIntFunction<Emp> function) {
		for (Emp emp : list) {
			System.out.println(function.applyAsInt(emp));

		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		// 이름만 출력
		printString(e -> e.name);
		printInt(e -> e.age);
	}
}
