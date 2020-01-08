package co.kim.dto;

import co.kim.dao.EmployeeDao;

public class MainApp {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		dao.select();

	}

}
