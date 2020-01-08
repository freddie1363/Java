package co.kim.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.kim.scope.Member;

public class MemberServiceImpl implements Service {
	
	private ArrayList<Member> list; //리스트 구조를 사용하기 위한 변수

	@Override
	public void insert() {
		Member member; //멤버클래스를 사용하기 위해 정의
		
		list = new ArrayList<Member>(); // 리스트 초기화
		member = new Member();
		Scanner sc = new Scanner(System.in);
		boolean b = true; // do while문 의 조건

		do {
			System.out.println("멤버를 추가하겠습니까?(Y/N)");
			String yesNo = sc.nextLine();
			if (yesNo.equals("N")) {
				b = false;
				break;
			}

			member = new Member();
			System.out.println("아이디를 입력하세요");
			member.setId(sc.nextLine());
			System.out.println("패스워드를 입력하세요");
			member.setPw(sc.nextLine());
			System.out.println("이름을 입력하세요");
			member.setName(sc.nextLine());
			System.out.println("주소를 입력하세요");
			member.setAddr(sc.nextLine());
			System.out.println("전화번호를 입력하세요");
			member.setTel(sc.nextLine());
			System.out.println("등급을 입력하세요");
			member.setGrade(sc.nextInt());
			sc.nextLine();

			list.add(member); //리스트에 추가 한다.

		} while (b);
		sc.close();

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for (Member member : list) {
			System.out.print(member.getId() + " ");
			System.out.print(member.getPw() + " ");
			System.out.print(member.getName() + " ");
			System.out.print(member.getAddr() + " ");
			System.out.print(member.getTel() + " ");
			System.out.println(member.getGrade() + " ");
		}
	}

}
