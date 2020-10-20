package PracticePack;

public class practiceclass {
	public static void main (String[] args) {
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double sums=0;
		float average=0;
		for(double i : salary) {
			sums+=i;
		}
		average=(float)sums/5;
		int c1=0,c2=0;
		for(double i : salary) {
			if (i>average)
				c1+=1;
			else 
				c2+=1;
		}
		System.out.println("Number of employee earning greater than average salary "+c1);
		System.out.println("Number of employee earning lesser than average salary "+c2);
	    }
}

