package co.micol.lambda;

import java.util.function.BiFunction;

public class LambdaTest {

	public static void main(String[] args) {
//
//		MyfunctionInterface f1 = new MyfunctionInterface() {                  // = 
//
//			@Override
//			public void method() {
//				System.out.println("실행됨");
//
//			
//		}};

//		MyfunctionInterface f1 = (x,y) -> {
//			if(x>y) {
//				return x;
//			}else
//				return y;
//	};
//	System.out.println(f1.max(2,4));
//	

		BiFunction<Integer, Integer, Integer> f1 = (x, y) -> {
			if (x > y)
				return x;
			else
				return y;
		};
		System.out.println(f1.apply(4, 14));

	}

}
