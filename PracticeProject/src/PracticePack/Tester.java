package PracticePack;

public class Tester {
	public static void main(String []args) {
		Chocolate c1=new Chocolate();
		System.out.println("Barcode: "+c1.getBarcode());
		System.out.println("Name: "+c1.getName());
		System.out.println("Weight: "+c1.getWeight());
		System.out.println("Cost: "+c1.getCost()+"\n\n");
		c1.setBarcode(102);
		c1.setName("Hershey's");
		c1.setWeight(24);
		c1.setCost(50);
		System.out.println("Barcode: "+c1.getBarcode());
		System.out.println("Name: "+c1.getName());
		System.out.println("Weight: "+c1.getWeight());
		System.out.println("Cost: "+c1.getCost());
	}

}
