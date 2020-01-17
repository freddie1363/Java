package co.kim.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import co.kim.dto.ProfDto;
import co.kim.service.DAO;
import co.kim.service.ProfService;


public class ServiceImpl extends DAO implements ProfService {
	private PreparedStatement psmt;
	private ResultSet rs;
	private ProfDto dto;

	private final String ALLSELECT = "SELECT PROFESSOR_CODE, PROFESSOR_NAME, PROFESSOR_DEPT, DEPT_NAME"
			+ " FROM PROFESSOR JOIN DEPT ON DEPT_CODE = PROFESSOR_DEPT";
	private final String SELECT = "SELECT PROFESSOR_CODE, PROFESSOR_NAME, PROFESSOR_DEPT, DEPT_NAME"
			+ " FROM PROFESSOR JOIN DEPT ON DEPT_CODE = PROFESSOR_DEPT WHERE PROFESSOR_CODE = ?";
	private final String INSERT = "INSERT INTO PROFESSOR VALUES(?,?,?)";
	private final String UPDATE = "UPDATE PROFESSOR SET PROFESSOR_DEPT = ? WHERE PROFESSOR_CODE = ?";
	private final String DELETE = "DELETE FROM PROFESSOR WHERE PROFESSOR_CODE =?";

	@Override
	public List<ProfDto> allSelect() {
		List<ProfDto> list = new ArrayList<ProfDto>();
		try {
			psmt = conn.prepareStatement(ALLSELECT);
			rs = psmt.executeQuery();
			while (rs.next()) {
				dto = new ProfDto();
				dto.setProfessor_code(rs.getString("professor_code"));
				dto.setProfessor_name(rs.getString("professor_name"));
				dto.setProfessor_dept(rs.getString("professor_dept"));
				dto.setDept_name(rs.getString("dept_name"));
				list.add(dto);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

	@Override
	public ProfDto select(ProfDto dto) {
		try {
			psmt = conn.prepareStatement(SELECT);
			psmt.setString(1, dto.getProfessor_code());
			rs = psmt.executeQuery();
			if(rs.next()) {
				
				dto.setProfessor_code(rs.getString("professor_code"));
				dto.setProfessor_name(rs.getString("professor_name"));
				dto.setProfessor_dept(rs.getString("professor_dept"));
				dto.setDept_name(rs.getString("dept_name"));
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dto;
	}

	@Override
	public int insert(ProfDto dto) {
		int n = 0;
		System.out.println("");
		
		try {
			psmt=conn.prepareStatement(INSERT);
			psmt.setString(1, dto.getProfessor_code());
			psmt.setString(2, dto.getProfessor_name());
			psmt.setString(3, dto.getProfessor_dept());
			n = psmt.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		if(n!=0) {
			System.out.println("등록되었습니다.");
		} else System.out.println("등록실패했습니다.");
		return n;
	}

	@Override
	public int update(ProfDto dto) {
		int n = 0;
		try {
			
			psmt=conn.prepareStatement(UPDATE);
			psmt.setString(1, dto.getProfessor_dept());
			psmt.setString(2, dto.getProfessor_code());
			n =psmt.executeUpdate();
			
			if(n!=0) {
				System.out.println("수정되었습니다.");
			} else System.out.println("수정실패했습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int delete(ProfDto dto) {
		int n = 0;
		try {
			
			psmt= conn.prepareStatement(DELETE);
			psmt.setString(1, dto.getProfessor_code());
			n=psmt.executeUpdate();
			
			if(n!=0) {
				System.out.println("삭제되었습니다.");
			} else System.out.println("삭제실패했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

}
