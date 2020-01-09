package co.kim.newInterface;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceService {
	default void run() { //인터페이스에서 몸체(구현된 것)를 가질수 있다. default는 인터페이스만 사용가능함
		System.out.println("인터페이스가 가지고 있는 메소드");
	}
	
	List<?> allSelect() throws SQLException;     //인터페이스 디폴트는 퍼블릭임
	Object select(Object o) throws SQLException;
	int insert(Object o) throws SQLException;
	int update(Object o) throws SQLException;
	int delete(Object o) throws SQLException;

}
