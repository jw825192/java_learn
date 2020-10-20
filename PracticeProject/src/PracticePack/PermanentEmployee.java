package PracticePack;

public class PermanentEmployee extends Employee {
	double basicpay;
	double hra;
	int experience;
	
	public PermanentEmployee (int eid,String ename,double ebasicpay,double ehra,int eexperience) {
		super(eid,ename);
		this.basicpay=ebasicpay;
		this.hra=ehra;
		this.experience=eexperience;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	void calculateSalary() {
		int variableComponent;
		if (this.getExperience()<3)
			variableComponent=0;
		else if (this.getExperience()>=3 && this.getExperience()<5)
			variableComponent=5;
		else if (this.getExperience()>=5 && this.getExperience()<10)
			variableComponent=7;
		else
			variableComponent=12;
		double salary=this.getBasicpay()*variableComponent/100+this.getHra()+this.getBasicpay();
		this.setSalary(salary);
		}
	}
