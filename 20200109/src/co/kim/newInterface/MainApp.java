package co.kim.newInterface;

import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		InterfaceService service = new InterfaceServiceImpl();
		CountryDto dto = new CountryDto();
		try {
		
		
		dto = (CountryDto) service.select("CA");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.print(dto.getCountry_id() + " ");
		System.out.print(dto.getCountry_name() + " ");
		System.out.println(dto.getRegion_id() + " ");
	}

}
