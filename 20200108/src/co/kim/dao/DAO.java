package co.kim.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.kim.dto.JobDto;

public class DAO {
	public Connection conn;
	
//	private PreparedStatement psmt;
//	private ResultSet rs; // select 구문에 결과 값을 받기 위해

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";

	public DAO() { // 생성될때 드라이버로드 와 연결해준다.
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

	}

//	public void select() {
//		JobDto dto = new JobDto();
//		String sql = "select * from jobs";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while(rs.next()) { 
//				dto.setJob_id(rs.getString("job_id"));
//				dto.setJob_title(rs.getString("job_title"));
//				dto.setMin_salary(rs.getInt("min_salary"));
//				dto.setMax_salary(rs.getInt("max_salary"));
//				dto.toString();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally { // 닫는다는 가정하에 써놓은 코딩이지만 파이널리 아래로 지워도 작동문제없음
//			try {
//			if(rs !=null) rs.close();
//			if(psmt !=null) psmt.close();
//			if(conn !=null)conn.close();
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
