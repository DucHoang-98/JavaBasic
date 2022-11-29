package Animals;

import java.lang.System.Logger;
import java.util.Scanner;

public abstract class Animals {

	private String nameAnimal;
	private String typeAnimal;
	private String kindOfAnimal;
	private double sizeAnimal;
	private double weightAnimal;
	private String footAnimal;
	private String sexAnimal;
	private String personalityAnimal;
	private String behaviorAnimal;

	public Animals() {
		super();
	}

	public Animals(String nameAnimal, String typeAnimal, String kindOfAnimal, double sizeAnimal, double weightAnimal,
			String footAnimal, String sexAnimal, String personalityAnimal, String behaviorAnimal) {
		super();
		this.nameAnimal = nameAnimal;
		this.typeAnimal = typeAnimal;
		this.kindOfAnimal = kindOfAnimal;
		this.sizeAnimal = sizeAnimal;
		this.weightAnimal = weightAnimal;
		this.footAnimal = footAnimal;
		this.sexAnimal = sexAnimal;
		this.personalityAnimal = personalityAnimal;
		this.behaviorAnimal = behaviorAnimal;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public String getKindOfAnimal() {
		return kindOfAnimal;
	}

	public void setKindOfAnimal(String kindOfAnimal) {
		this.kindOfAnimal = kindOfAnimal;
	}

	public double getSizeAnimal() {
		return sizeAnimal;
	}

	public void setSizeAnimal(double sizeAnimal) {
		this.sizeAnimal = sizeAnimal;
	}

	public double getWeightAnimal() {
		return weightAnimal;
	}

	public void setWeightAnimal(double weightAnimal) {
		this.weightAnimal = weightAnimal;
	}

	public String getFootAnimal() {
		return footAnimal;
	}

	public void setFootAnimal(Scanner sc) {
		System.out.println("1. 0/2/4/Mutil ");
		System.out.println("2. Many ");
		System.out.println("Choise : ");
		int choiseFoot = Integer.parseInt(sc.nextLine());
		if (choiseFoot == 1) {
			System.out.println("Foot");
			String checkFoot = sc.nextLine();
			if (checkFoot.equals("2") || checkFoot.equals("0") || checkFoot.equals("4")) {
				 this.footAnimal = checkFoot;
			}else {
				this.footAnimal = "Unknow";
			}
		}else if (choiseFoot == 2) {
			this.footAnimal = "Mutil legs";
		}
	}

	public String getSexAnimal() {
		return sexAnimal;
	}

	public void setSexAnimal(Scanner sc) {
		System.out.println("1. Male ");
		System.out.println("2. Female ");
		System.out.println("Choise : ");
		int choiseSex = Integer.parseInt(sc.nextLine());
		if (choiseSex == 1) {
			this.sexAnimal = "Male";
		}else if (choiseSex == 2) {
				this.sexAnimal = "Female";
			}
	}

	public String getPersonalityAnimal() {
		return personalityAnimal;
	}

	public void setPersonalityAnimal(Scanner sc) {
		System.out.println("1. Meek");
		System.out.println("2. ferocious");
		int  checkPersona = Integer.parseInt(sc.nextLine());
		if(checkPersona == 1) {
			this.personalityAnimal = "Meek";
		}else if(checkPersona == 2) {
			this.personalityAnimal = "ferocious";
		}else {
			this.personalityAnimal = "Meek";
		}
	}

	public String getBehaviorAnimal() {
		return behaviorAnimal;
	}

	public void setBehaviorAnimal(Scanner sc) {
		System.out.println("1.Herd Life");
		System.out.println("2.Alone");
		int checkBehavior = Integer.parseInt(sc.nextLine());
		if(checkBehavior == 1) {
			this.behaviorAnimal = "Herd Life";
		}else if(checkBehavior == 2) {
			this.behaviorAnimal = "Alone";
		}else {
			this.behaviorAnimal = "Alone";
		}
	}
	
	public void input(Scanner sc) {
		System.out.println("Input name of animal : ");
		setNameAnimal(sc.nextLine());
		System.out.println("Input kind of animal : ");
		setKindOfAnimal(sc.nextLine());
		System.out.println("Input size of animals : ");
		setSizeAnimal(Double.parseDouble(sc.nextLine()));
		System.out.println("Input weight of animal : ");
		setWeightAnimal(Double.parseDouble(sc.nextLine()));
		System.out.println("Input foot of animal  ");
		setFootAnimal(sc);
		System.out.println("Input sex of animal : ");
		setSexAnimal(sc);
		System.out.println("Input personality of animal : ");
		setPersonalityAnimal(sc);
		System.out.println("Input behavior of animal : ");
		setBehaviorAnimal(sc);
	}

	public void output() {
		System.out.println("Name of animal : " + getNameAnimal());
		System.out.println("Kind of animal : " + getKindOfAnimal());
		System.out.println("Size of animal : " + getSizeAnimal());
		System.out.println("Weight of animal : " + getWeightAnimal());
		System.out.println("Foot of animal : " + getFootAnimal());
		System.out.println("Sex of animal : " + getSexAnimal());
		System.out.println("Personality of animal : " + getPersonalityAnimal());
		System.out.println("Behavior of animal : " + getBehaviorAnimal());
	}
	
	public abstract void move();

	public abstract void eat();

	public abstract void drink();

	public abstract void noise();

	public abstract void relax();
}
