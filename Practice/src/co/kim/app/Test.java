package co.kim.app;

import java.util.ArrayList;
import java.util.List;

import co.kim.dto.ProfDto;
import co.kim.serviceimpl.ServiceImpl;

public class Test {
	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		List<ProfDto> list = new ArrayList<ProfDto>();

		list = service.allSelect();
		for (ProfDto dto : list) {

			System.out.print(dto.getProfessor_code() + " ");
			System.out.print(dto.getProfessor_name() + " ");
			System.out.print(dto.getProfessor_dept() + " ");
			System.out.println(dto.getDept_name() + " ");

		}

	}
}
