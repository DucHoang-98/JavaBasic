package Animals;

import java.util.Scanner;

public class Fish extends Animals {

	private  String Swing ;
	
	public Fish() {
		super();
	}

	public String getSwing() {
		return Swing;
	}



	public void setSwing(String swing) {
		Swing = swing;
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
		// TODO Auto-generated method stub
		super.input(sc);
		this.setTypeAnimal("Fish");
		System.out.println("Input swimming place of fish");
		setSwing(sc.nextLine());
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("Type of animal : " + getTypeAnimal());
		System.out.println("Specian of animal : " + getSwing());
	}
	
	





}
