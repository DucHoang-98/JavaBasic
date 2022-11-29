package Animals;

import java.util.Scanner;

public class Animal extends Animals{
	
	private final String specialAnimal = "mammals";
	
	public Animal() {
		super();
	}
	
	@Override
	public void move() {
	}

	@Override
	public void eat() {

	}

	@Override
	public void drink() {

		
	}

	@Override
	public void noise() {

		
	}

	@Override
	public void relax() {

		
	}

	@Override
	public void input(Scanner sc) {
		super.input(sc);
		setTypeAnimal("Animal");
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Type of animal : " + getTypeAnimal());
		System.out.println("Special of animal : " + specialAnimal);
	}

}
