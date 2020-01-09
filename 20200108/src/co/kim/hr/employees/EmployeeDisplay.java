package co.kim.hr.employees;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDisplay {
//	List<EmployeeDto> list;
	
	public void allSelectList() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		List<EmployeeDto> list;
		list = new ArrayList<EmployeeDto>();
		try {
			list = emp.allSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(EmployeeDto dto : list)
			dto.toString();
		
	}
	
	
	public void employeeInsert() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Date date = Date.valueOf("2020-01-10"); //날짜를 생성
		dto.setEmployee_id(222);
		dto.setFirst_name("승리");
		dto.setLast_name("박");
		dto.setEmail("PARK");
		dto.setHire_date(date); //날짜값
		dto.setJob_id("AD_PRES");
		dto.setPhone_number("010.2222.2222");
		dto.setSalary(150000);
		dto.setCommission_pct(0);
		dto.setManager_id(100);
		dto.setDepartment_id(60);
		
		try {
			int n = emp.insert(dto);
			if(n !=0)
				System.out.println("정상으로 입력되었음!!!!!!!!");
			else
				System.out.println("입력이 실패했습니다.!!!!!!!!!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public void searchSelect() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사용자 ID를 입력하세요.");
		int key = sc.nextInt(); //키보드에서 입력한 id를 저장
		try {
			dto = emp.select(key);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		dto.toString();
		sc.close();
		
	}
	
	public void employeeDelete() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사용자 ID를 입력하세요.");
		dto.setEmployee_id(sc.nextInt()); //키보드에서 입력한 id를 저장
		try {
			int n = emp.delete(dto);
			if(n !=0)
				System.out.println("정상적으로 삭제 됨");
			else
				System.out.println("삭제 되지 않았습니다.");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		sc.close();
		allSelectList(); //삭제 후 전체리스트를 보여준다.
		
		
		
		
	}
	
	
	public void update() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사용자 ID를 입력하세요.");
		int key = sc.nextInt();
		try {
			dto = emp.select(key);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		dto.toString();
		sc.nextLine();
		System.out.println("변경할 First Name을 입력하세요.");
		dto.setFirst_name(sc.nextLine());
		try {
			int n = emp.update(dto);
			if(n!=0) 
				System.out.println("정상적으로 변경");
			else 
				System.out.println("변경 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		allSelectList();
		
	}
	
}
