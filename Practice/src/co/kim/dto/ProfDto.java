package co.kim.dto;

public class ProfDto {
	private String professor_code;
	private String professor_name;
	private String professor_dept;
	private String dept_name;
	private String dept_code;

	public ProfDto() {

	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getProfessor_code() {
		return professor_code;
	}

	public void setProfessor_code(String professor_code) {
		this.professor_code = professor_code;
	}

	public String getProfessor_name() {
		return professor_name;
	}

	public void setProfessor_name(String professor_name) {
		this.professor_name = professor_name;
	}

	public String getProfessor_dept() {
		return professor_dept;
	}

	public void setProfessor_dept(String professor_dept) {
		this.professor_dept = professor_dept;
	}

}
