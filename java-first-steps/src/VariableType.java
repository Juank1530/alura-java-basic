
public class VariableType {
	
	public static void main(String[] args) {
		
		System.out.println("I'm goin to show my age");
		
		int age = 37;
		
		System.out.println(age);
		
		age = 40;
		
		System.out.println(age);
		
		age = 20 + 82;
		
		System.out.println("My age is :" + age);
		
		double salary = 30.02;
		
		System.out.println(salary);
		
		double ages = 30.02;
		
		System.out.println(ages); 
		
		double salaryHalf = salary/2;
		
		System.out.println(salaryHalf);
		
		double variable1 = 852.65;
		int variable1Int = (int) variable1; // Cast double to int 
		System.out.println(variable1Int);
		
		//long longTest = 8975466549897984688L; //Here we used the letter L to show that this number is a long number
		//short shortTest = 15789;
		//byte byteTest = 15;
		//float floatTest = 2.5F; //Here we used the letter F to show that this number is a float number
		
		int resulset = (int) variable1 + variable1Int;
		
		System.out.println(resulset);
		
	}

}
