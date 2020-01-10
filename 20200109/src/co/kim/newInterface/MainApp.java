package co.kim.newInterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		InterfaceService service = new InterfaceServiceImpl();
		CountryDto dto = new CountryDto();
		try {

			dto = (CountryDto) service.select("CA");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.print(dto.getCountry_id() + " ");
		System.out.print(dto.getCountry_name() + " ");
		System.out.println(dto.getRegion_id() + " ");
		
		System.out.println("==============전체 리스트===============");
		allSelectPrint();
	}

	private static void allSelectPrint() {
		InterfaceService service = new InterfaceServiceImpl();
		List<?> list = new ArrayList<CountryDto>();
		try {
			list = service.allSelect();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Object dto : list) {
			System.out.print(((CountryDto)dto).getCountry_id() + " ");
			System.out.print(((CountryDto)dto).getCountry_name() + " ");
			System.out.println(((CountryDto)dto).getRegion_id() + " ");
			
		}

	}

}
