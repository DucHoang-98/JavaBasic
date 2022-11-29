package Animals;

import java.util.Scanner;

public class Reptile extends Animals {

	private final String specialReptile = "Thermogenic animals";
	
	public Reptile() {
		super();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void relax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void input(Scanner sc) {
		super.input(sc);
		this.setTypeAnimal("Reptile");
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Type of animal : " + this.getTypeAnimal());
		System.out.println("Special of animal : " + specialReptile);
	}
	
	

}
