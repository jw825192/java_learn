package PracticePack;


public class ContractEmployee extends Employee {
	double wages;
	int hours;
	
	public ContractEmployee(int eid,String ename,double ewages,int ehours) {
		super(eid,ename);
		this.wages=ewages;
		this.hours=ehours;
	}
	
	void calculateSalary() {
		double salary;
		salary=this.getWages()*this.getHours();
		this.setSalary(salary);
	}
	
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
}
