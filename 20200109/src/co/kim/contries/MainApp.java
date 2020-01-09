package co.kim.contries;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.kim.hr.employees.EmployeeDto;
import co.kim.hr.employees.EmployeeServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		List<ContryDto> list = new ArrayList<ContryDto>();
		ContryServiceImpl contryImpl =new ContryServiceImpl();
		list=contryImpl.allSelect();
		
		toPrint(list);
		update();
		
		
		
	}

	

	private static void toPrint(List<ContryDto> list) {
		for (ContryDto dto : list) {
			System.out.print(dto.getCountry_id() + " : ");
			System.out.print(dto.getCountry_name() + " : ");
			System.out.println(dto.getRegion_id() + " : ");

		}
	}

	public static void update() {
		ContryServiceImpl contryImpl = new ContryServiceImpl();
		ContryDto dto = new ContryDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사용자 ID를 입력하세요.");
		String key = sc.nextLine();
		try {
			contryImpl.select(key);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		dto.toString();
		sc.nextLine();
		System.out.println("변경할 Country Name을 입력하세요.");
		dto.setCountry_name(sc.nextLine());
		try {
			int n = contryImpl.update(dto);
			if(n!=0) 
				System.out.println("정상적으로 변경");
			else 
				System.out.println("변경 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
		
	}

}
