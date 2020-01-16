package co.micol.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareTest {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("홍",20));
		list.add(new Emp("김",24));
		list.add(new Emp("박",10));
		list.add(new Emp("최",5));
		
		System.out.println(list);
		
	
		//이름 순으로
//		Collections.sort(list, new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				return o1.name.compareTo(o2.name);   // o1.age - o2.age 로 하면 나이(인트값) 비교
//			}
//			
//			
//		}  );
		//위 -> 아래 람다식
		Collections.sort(list, (Emp o1, Emp o2)-> {
			return o1.name.compareTo(o2.name);
			
		} );
								
		System.out.println(list);
		
		//Map
		Map<String, Emp> map = new HashMap<>();
		map.put("100", new Emp("홍",20));
		
		Map<String, Emp> map2 = Collections.singletonMap(("100"), new Emp("홍",20));
		
		
		
		
		
		
	}

}

