package co.kim.contries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class ContryServiceImpl extends ContryService {

	private PreparedStatement psmt;
	private ResultSet rs;
	private List<ContryDto> list;

	private final String ALL_SELECT = "select * from countries";
	private final String CONTRY_INSERT = "insert into countries values(?,?,?)";
	private final String SEARCH_SELECT = "select * from countries where country_id = ?";
	private final String CONTRY_DELETE = "delete from countries where country_id = ?";
	private final String CONTRY_UPDATE = "update countries country_name=?,region_id=? where country_id = ?";

	@Override
	public List<ContryDto> allSelect() {
		List<ContryDto> list = new ArrayList<ContryDto>();
		ContryDto dto;
		try {
			psmt = conn.prepareStatement(ALL_SELECT);
			rs = psmt.executeQuery();
			while (rs.next()) {
				dto = new ContryDto();
				dto.setCountry_id(rs.getString("country_id"));
				dto.setCountry_name(rs.getString("country_name"));
				dto.setRegion_id(rs.getInt("region_id"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ContryDto select(String key) throws SQLException {
		ContryDto dto = new ContryDto();
		psmt = conn.prepareStatement(SEARCH_SELECT);
		psmt.setString(1, key);
		rs = psmt.executeQuery();
		if(rs.next()) {
			dto.setCountry_id(rs.getString("country_id"));
			dto.setCountry_name(rs.getString("country_name"));
			dto.setRegion_id(rs.getInt("region_id"));
			
			
		} else {
			System.out.println("존재하지 않는 레코드 입니다.");
		}
		return dto;
	}

	@Override
	public int insert(ContryDto dto) throws SQLException {

		psmt = conn.prepareStatement(CONTRY_INSERT);
		psmt.setString(1, dto.getCountry_id());
		psmt.setString(2, dto.getCountry_name());
		psmt.setInt(3, dto.getRegion_id());
		int n = psmt.executeUpdate();

		return n;
	}

	@Override
	public int update(ContryDto dto) throws SQLException {
		psmt = conn.prepareStatement(CONTRY_UPDATE);
		psmt.setString(1, dto.getCountry_id());
		psmt.setString(2, dto.getCountry_name());
		psmt.setInt(3, dto.getRegion_id());
		int n = psmt.executeUpdate();

		return n;

	}

	@Override
	public int delete(ContryDto dto) throws SQLException {
		psmt = conn.prepareStatement(CONTRY_DELETE);
		psmt.setString(1, dto.getCountry_id());
		int n = psmt.executeUpdate();
		return n;
	}

}
