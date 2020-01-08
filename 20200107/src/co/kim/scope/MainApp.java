package co.kim.scope;

import co.kim.interfaceTest.MemberServiceImpl;
import co.kim.interfaceTest.Service;
import co.kim.interfaceTest.StudentServiceImpl;

public class MainApp {

	public static void main(String[] args) {
//		Member member = new Member();
//		member.setId("Hong");
//		member.setPw("1234");
//		member.setName("홍길동");
//		member.setAddr("대구광역시 중구 국채보상로");
//		member.setTel("010-1111-1111");
//		member.setGrade(1);

//		member.toString();

//		member = new Member("Park","2345","박승리","서울광역시 중구 종로","010-2222-2222",2);
//		member.insert("Park","2345","박승리","서울광역시 중구 종로","010-2222-2222",2);
//		member.toString();
//		System.out.println(member.getId() + " " + member.getPw() );

//		Service service = new MemberServiceImpl();
		Service service = new StudentServiceImpl();
		service.insert();
		service.display();
		
		

//		Service se2 = new StudentServiceImpl();
//		se2.insert();
//		se2.display();

	}

}
