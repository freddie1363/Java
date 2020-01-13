package co.kim.generic;

import co.kim.overloading.Calcurator;

public class MainApp {

	public static void main(String[] args) {
		GenericTest<String> box = new GenericTest<String>();
		box.set("Hello");
		System.out.println(box.get());

		GenericTest<Integer> in = new GenericTest<Integer>();
		in.set(Integer.valueOf(5));
		System.out.println(in.get() + 10);

//		Calcurator calcurator = new Calcurator();
//		int n = calcurator.sum(10, 20);
//		float sum = calcurator.sum(10.4f, 21.1f);
//		System.out.println(n);
//		System.out.println(sum);
		
		Gcalcurator gc = new Gcalcurator();
		int n = (int) gc.sum(200, 300);
		float sum = (float) gc.sum(21.5f, 30.4f);
		System.out.println(n);
		System.out.println(sum);
		
		

	}

}
