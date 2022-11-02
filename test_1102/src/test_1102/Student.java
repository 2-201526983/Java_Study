package test_1102;

public class Student {
	private String name;
	private String dept;
	private String id;
	private double grade;
	
	public Student() {}
	public Student(String name, String dept, String id, double grade) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return name + ", " + dept + ", " + id + ", " + grade;
	}
	

}
