package tns.day13.collections.list;

public class Employee {
	private int empNo, empSalary;
	private String empName;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empSalary=" + empSalary + ", empName=" + empName + "]";
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empNo, String empName, int empSalary) {
		super();
		this.empNo = empNo;
		this.empSalary = empSalary;
		this.empName = empName;
	}
	
	

}
