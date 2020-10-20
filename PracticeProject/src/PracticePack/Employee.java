package PracticePack;


public class Employee {
	int empid;
	String name;
	double salary;
	
	public Employee(int eid,String ename) {
		this.empid=eid;
		this.name=ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
