package co.kim.hr.employees;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
