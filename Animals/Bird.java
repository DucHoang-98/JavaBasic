package Animals;

import java.util.List;
import java.util.Scanner;

import QuanLySachBao.main;

public class Bird extends Animals{
	
	private String Wings;
	
	public Bird() {
		super();
	}
	
	public String getWings() {
		return Wings;
	}



	public void setWings(String wings) {
		Wings = wings;
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
		setTypeAnimal("Bird");
		System.out.println("Input to Wings of animal :");
		setWings(sc.nextLine());
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Type of animal : " + this.getTypeAnimal());
		System.out.println("Wings of animal : " + getWings());
	}
}
