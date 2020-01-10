package co.kim.dowhile;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.kim.contries.ContryDto;
import co.kim.contries.ContryService;
import co.kim.contries.ContryServiceImpl;



public class Menu {
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {

		int choice;
		boolean b = true;
		do {
			System.out.println("========ERP========");
			System.out.println(" 1. 직원관리 ");
			System.out.println(" 2. 급여관리 ");
			System.out.println(" 3. 부서관리 ");
			System.out.println(" 4. 종료 ");
			System.out.println("===================");
			System.out.println("원하는 작업 번호를 입력하세요.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				employeeMenu();
				break;
			case 2:
				salaryMenu();
				break;
			case 3:
				departmentMenu();
				break;
			case 4:
				b = false;
				System.out.println("프로그램이 종료 되었습니다.");
				break;

			}
		} while (b);

	}

	public void employeeMenu() {

		int choice;
		boolean b = true;
		do {
			System.out.println("========직원관리========");
			System.out.println(" 1. 직원조회 ");
			System.out.println(" 2. 직원등록 ");
			System.out.println(" 3. 직원갱신 ");
			System.out.println(" 4. 직원삭제 ");
			System.out.println(" 5. 돌아가기 ");
			System.out.println("===================");
			System.out.println("원하는 작업 번호를 입력하세요.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("직원 조회하는 화면.");
				break;
			case 2:
				System.out.println("직원 등록하는 화면.");
				break;
			case 3:
				System.out.println("직원 갱신하는 화면.");
				break;
			case 4:
				System.out.println("직원 삭제하는 화면.");
				break;
			case 5:
				b = false;
				break;

			}
		} while (b);

	}

	public void salaryMenu() {

		int choice;
		boolean b = true;
		do {
			System.out.println("========급여관리========");
			System.out.println(" 1. 급여조회 ");
			System.out.println(" 2. 급여등록 ");
			System.out.println(" 3. 급여갱신 ");
			System.out.println(" 4. 급여삭제 ");
			System.out.println(" 5. 돌아가기 ");
			System.out.println("===================");
			System.out.println("원하는 작업 번호를 입력하세요.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
//				국가 조회하는 연결 System.out.println("급여 조회하는 화면."); 이었으나 지금은 올셀렉트 구현해봄
				ContryService service = new ContryServiceImpl();
				List<ContryDto> list = new ArrayList<ContryDto>();
				list = service.allSelect();
				for(ContryDto dto : list) {
					System.out.print(dto.getCountry_id() + " : ");
					System.out.print(dto.getCountry_name() + " : ");
					System.out.println(dto.getRegion_id() + " : ");
				}
				break;
			case 2:
//				System.out.println("급여 등록하는 화면."); 이었으나 지금은 조건부 셀렉트 구현해봄
				ContryService service1 = new ContryServiceImpl();
				List<ContryDto> list1 = new ArrayList<ContryDto>();
				
				ContryDto dto = new ContryDto();
				try {

					dto = (ContryDto) service1.select("CA");
				} catch (SQLException e) {
					e.printStackTrace();
				}

				System.out.print(dto.getCountry_id() + " ");
				System.out.print(dto.getCountry_name() + " ");
				System.out.println(dto.getRegion_id() + " ");
				
				System.out.println("==============전체 리스트===============");
				list1 = service1.allSelect();
				for(ContryDto dto1 : list1) {
					System.out.print(dto1.getCountry_id() + " : ");
					System.out.print(dto1.getCountry_name() + " : ");
					System.out.println(dto1.getRegion_id() + " : ");
				}
				
				
				break;
			case 3:
				System.out.println("급여 갱신하는 화면.");
				break;
			case 4:
				System.out.println("급여 삭제하는 화면.");
				break;
			case 5:
				b = false;
				break;

			}
		} while (b);

	}

	public void departmentMenu() {

		int choice;
		boolean b = true;
		do {
			System.out.println("========부서관리========");
			System.out.println(" 1. 부서조회 ");
			System.out.println(" 2. 부서등록 ");
			System.out.println(" 3. 부서갱신 ");
			System.out.println(" 4. 부서삭제 ");
			System.out.println(" 5. 돌아가기 ");
			System.out.println("===================");
			System.out.println("원하는 작업 번호를 입력하세요.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("부서 조회하는 화면.");
				break;
			case 2:
				System.out.println("부서 등록하는 화면.");
				break;
			case 3:
				System.out.println("부서 갱신하는 화면.");
				break;
			case 4:
				System.out.println("부서 삭제하는 화면.");
				break;
			case 5:
				b = false;
				break;

			}
		} while (b);

	}

}
