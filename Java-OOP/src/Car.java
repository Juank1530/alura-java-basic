
public class Car {
	
	private int year;
	private String model;
	private double price;
	
	public Car() {
		
	}
	
	public Car(int year, String model, double price) {
		
		this.model = model;
		this.price = price;
		
		if (year >= 1891) {
			this.year = year;
		} else {
			System.out.println("The year " + year + " is not valid, we are going to use 2017 by default");
			this.year = 2017;
		}
		
		if (model != null) {
			this.model = model;
		} else {
			System.out.println("The model can be null");
			this.model = "Gol";
		}
		
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("The price can be 0");
			this.price = 400000;
		}
		
		
	}
	
	public Car(String model, double price) {
		this(2017,model,price);
	}
	
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

	

}
