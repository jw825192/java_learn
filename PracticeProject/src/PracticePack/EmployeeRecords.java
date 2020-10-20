package PracticePack;

public class EmployeeRecords {
	public static void main (String[] args) {
		PermanentEmployee p1=new PermanentEmployee(101,"Anil",10000,1500,3);
		p1.calculateSalary();
		System.out.println("Permanent Employee: Your salary is: "+p1.getSalary());
		ContractEmployee c1=new ContractEmployee(102,"Anikit",500,10);
		c1.calculateSalary();
		System.out.println("Contract Employee: Your salary is: "+c1.getSalary());
	}

}
