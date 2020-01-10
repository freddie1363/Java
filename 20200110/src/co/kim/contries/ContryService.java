package co.kim.contries;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public abstract class ContryService {
	public Connection conn;
	public PreparedStatement psmt;
	public ResultSet rs;
	private String driver;
	private String url;
	private String user;
	private String password;

	public ContryService() {
		dbconfiguration(); // 외부 설정파일을 읽어오는 메소드
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private void dbconfiguration() {
		Properties properties = new Properties();
		Reader reader;
		try {
			reader = new FileReader("config/db.properties");
			properties.load(reader);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public abstract List<ContryDto> allSelect();

	public abstract ContryDto select(String key) throws SQLException;

	public abstract int insert(ContryDto dto) throws SQLException;

	public abstract int update(ContryDto dto) throws SQLException;

	public abstract int delete(ContryDto dto) throws SQLException; 

}
