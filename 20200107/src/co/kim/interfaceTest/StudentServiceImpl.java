package co.kim.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.kim.scope.Student;

public class StudentServiceImpl implements Service {
//	private Student student;//스튜던트 클래스를 사용하기 위해 정의
	private ArrayList<Student> list;

	@Override
	public void insert() {
		Student student;
		student = new Student();
		list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		boolean a = true;

		do {
			System.out.println("학생을 추가하시겠습니까?(Y/N)");
			String yesNo = sc.nextLine();
			if (yesNo.equals("n") || yesNo.equals("N")) {
				a = false;
				break;
			}
			student = new Student();
			System.out.println("학번을 입력하세요");
			student.setId(sc.nextLine());
			System.out.println("이름을 입력하세요");
			student.setName(sc.nextLine());
			System.out.println("전공을 입력하세요");
			student.setMajor(sc.nextLine());
			System.out.println("전화번호를 입력하세요");
			student.setTel(sc.nextLine());
			

			list.add(student);

		} while (a);
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
		for (Student student : list) {
			System.out.print(student.getId() + " ");
			System.out.print(student.getName() + " ");
			System.out.print(student.getMajor() + " ");
			System.out.println(student.getTel() + " ");

		}
	}
}
