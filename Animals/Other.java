package Animals;

import java.util.Scanner;

public class Other extends Animals{
	
	private String specialAnimal;
	
	public Other() {
		super();
	}


	public Other(String specialAnimal) {
		super();
		this.specialAnimal = specialAnimal;
	}

	public String getSpecialAnimal() {
		return specialAnimal;
	}


	public void setSpecialAnimal(String specialAnimal) {
		this.specialAnimal = specialAnimal;
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
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void input(Scanner sc) {
		super.input(sc);
		this.setTypeAnimal("Other");
		System.out.println("Input special of animal : " );
		setSpecialAnimal(sc.nextLine());
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Special of animal : " + getSpecialAnimal());
	}




	
}
