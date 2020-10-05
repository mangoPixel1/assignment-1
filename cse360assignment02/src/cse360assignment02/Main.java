package cse360assignment02;

public class Main {

	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
	
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		myCalculator.clear();
		
		myCalculator.add(6);
		myCalculator.subtract(4);
		myCalculator.add(2);
		
		System.out.println(myCalculator.toString());
		
		System.out.println("Total: " + myCalculator.getTotal());
	}

}
