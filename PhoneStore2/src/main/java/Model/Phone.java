package Model;

/*
* Copyright 2014 Giuliano Bertoti 
* Released under the MIT license 
* github.com/giulianobertoti
*/

public class Phone {

	private double price;
	private String color;
	private String os;
	private Specification spec;
	
	public Phone(){
	}
	
	public Phone(double pri, String co, String o, Specification sp){
		price = pri;
		color = co;
		os = o;
		spec = sp;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Specification getSpec() {
		return spec;
	}

	public void setSpec(Specification spec) {
		this.spec = spec;
	}

	
	
	

	
	
}