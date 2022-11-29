package Animals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import QuanLySachBao.main;

public class ManagerAnimails {

	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();

	private List<Animals> listAnimals;

	public ManagerAnimails() {
		listAnimals = new ArrayList<>();
	}

	public void showMenu() {
		int choise = 0;
		do {
			menu.menu();
			choise = sc.nextInt();
			sc.nextLine();
			if (choise == 1) {
				showAddSubMenu();
			} else if (choise == 2) {
				showUpdateSubMenu();
			} else if (choise == 3) {
				deleteSubMenu();
			} else if (choise == 4) {
				showInfoSubMenu();
			} else if (choise == 5) {
				showSortSubMenu();
			} else if (choise == 6) {
				showNumberSexSubMenu();
			} else {
				System.out.println("Exit");
			}

		} while (choise >= 1 && choise <7);
	}
	
	public void showSortSubMenu() {
		int a = 0;
		do {
			menu.sortByNameSubMenu();
			a = sc.nextInt();
			sortByNameAnimal(a);
		} while (a > 0 && a < 9);
	}
	
	public void sortByNameAnimal(int userChoise) {
		if(userChoise == 1) {
			
		}
	}

	// menu them 1 loai dong vat
	public void showAddSubMenu() {
		int a = 0;
		do {
			System.out.println("How many enter animal? ");
			int enterAnimal = sc.nextInt();
			if (enterAnimal < 1) {
				a = 0;
				break;
			} else {
				menu.addSubMenu();
				a = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < enterAnimal; i++) {
					add(a);
				}
				a = 0;
			}
		} while (a > 0 && a < 7);
	}

	// show menu update
	public void showUpdateSubMenu() {
		int a = 0;
		do {
			System.out.println("How many enter update animal? ");
			int enterAnimal = sc.nextInt();
			if (enterAnimal < 1) {
				a = 0;
				break;
			} else {
				menu.updateSubMenu();
				a = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < enterAnimal; i++) {
					choiseUpdateAnimal(a);
				}
				a = 0;
			}
		} while (a > 0 && a < 7);

	}

	// Menu hiển thị chức năng xóa
	public void deleteSubMenu() {
		int a = 0;
		do {
			menu.deleteSubMenu();
			int deleteAnimal = sc.nextInt();
			for (int i = 0; i < deleteAnimal; i++) {
				delete(deleteAnimal);
			}
		} while (a > 0 && a < 4);
	}

	// menu hien thi thong tin dong vat
	public void showInfoSubMenu() {
		int b = 0;
		do {
			menu.showSubMenu();
			b = sc.nextInt();
			show(b);
		} while (b >= 1 && b <= 2);
	}

	public void showNumberSexSubMenu() {
		int a = 0;
		do {
			menu.subMenuShowNumberOfAnimalsBySex1();
			a = sc.nextInt();
			choiseNumberSex(a);
		} while (a > 0 && a < 8);
	}

	// ham them 1 loai dong vat
	public void add(int userChoise) {
		switch (userChoise) {
		case 1:
			Bird bird = new Bird();
			bird.input(sc);
			listAnimals.add(bird);
			break;
		case 2:
			Fish fish = new Fish();
			fish.input(sc);
			listAnimals.add(fish);
			break;
		case 3:
			Amphibian amphibian = new Amphibian();
			amphibian.input(sc);
			listAnimals.add(amphibian);
			break;
		case 4:
			Reptile reptile = new Reptile();
			reptile.input(sc);
			listAnimals.add(reptile);
			break;
		case 5:
			Animal animal = new Animal();
			animal.input(sc);
			listAnimals.add(animal);
			break;
		case 6:
			Other other = new Other();
			other.input(sc);
			listAnimals.add(other);
			break;
		case 7:
			break;
		default:
			System.out.println("Choie is null ");
			menu.menu();
		}
	}

	// Ham update thong tin, nơi user chọn các chức năng
	public void choiseUpdateAnimal(int userChoise) {
		String updateByName;
		String userChoiseUpdate = null;
		if (userChoise == 1) {
			System.out.println("Input name animal you want to update : ");
			updateByName = sc.nextLine();
			update(userChoiseUpdate, updateByName);
		} else if (userChoise == 2) {
			System.out.println("Input name animal you want to update : ");
			updateByName = sc.nextLine();
			update(userChoiseUpdate, updateByName);
		} else if (userChoise == 3) {
			System.out.println("Input name animal you want to update : ");
			updateByName = sc.nextLine();
			update(userChoiseUpdate, updateByName);
		} else if (userChoise == 4) {
			System.out.println("Input name animal you want to update : ");
			updateByName = sc.nextLine();
			update(userChoiseUpdate, updateByName);
		} else if (userChoise == 5) {
			System.out.println("Input name animal you want to update : ");
			updateByName = sc.nextLine();
			update(userChoiseUpdate, updateByName);
		} else if (userChoise == 6) {
			System.out.println("Input name animal you want to update : ");
			updateByName = sc.nextLine();
			update(userChoiseUpdate, updateByName);
		} else {
			System.out.println("Choie is null ");
			menu.menu();
		}
	}

	// thực hiện chức năng update
	public void update(String ChoiseUpdate, String updateByName) {
		for (Animals animals : listAnimals) {
			if (updateByName.equals(animals.getNameAnimal())) {
				menu.updateSubMenu2();
				ChoiseUpdate = sc.nextLine();
				if (ChoiseUpdate.equals("1")) {
					System.out.println("Update name : ");
					animals.setNameAnimal(sc.nextLine());
				} else if (ChoiseUpdate.equals("2")) {
					System.out.println("Update type :");
					animals.setTypeAnimal(sc.nextLine());
				} else if (ChoiseUpdate.equals("3")) {
					System.out.println("Update kind of animal : ");
					animals.setKindOfAnimal(sc.nextLine());
				} else if (ChoiseUpdate.equals("4")) {
					System.out.println("Update size of animal : ");
					animals.setSizeAnimal(Double.parseDouble(sc.nextLine()));
				} else if (ChoiseUpdate.equals("5")) {
					System.out.println("Update weight of animal : ");
					animals.setWeightAnimal(Double.parseDouble(sc.nextLine()));
				} else if (ChoiseUpdate.equals("6")) {
					System.out.println("update foot of animal");
					animals.setFootAnimal(sc);
				} else if (ChoiseUpdate.equals("7")) {
					System.out.println("Update sex of animal");
					animals.setSexAnimal(sc);
				} else if (ChoiseUpdate.equals("8")) {
					System.out.println("Update personality of animal");
					animals.setPersonalityAnimal(sc);
				} else if (ChoiseUpdate.equals("9")) {
					System.out.println("Update behavior of animal");
					animals.setBehaviorAnimal(sc);
				}
			}
			if (!updateByName.equals(animals.getNameAnimal())) {
				System.out.println("Unknow");
				break;
			}
		}
	}

	// ham hien thi thong tin dong vat
	public void show(int userChoise) {
		switch (userChoise) {
		case 1: // show thông tin của 1 loài động vật
			sc.nextLine();
			System.out.println("Input name animal want to show info");
			String name = sc.nextLine();
			for (Animals animals : listAnimals) {
				if (name.equals(animals.getNameAnimal())) {
					animals.output();
				} else {
					System.out.println("Name of animal is null");
				}
			}
			break;
		case 2:// show thông tin tất cả các loài vật
			for (Animals animals : listAnimals) {
				animals.output();
			}
			break;
		case 3:

			break;
		default:

		}
	}

	// ham xoa 1 loai dong vat
	public void delete(int userChoise) {
		switch (userChoise) {
		case 1:
			System.out.println("Input name animal want to delete ");
			String name = sc.nextLine();
			for (int i = 0; i < listAnimals.size(); i++) {
				if (name.equals(listAnimals.get(i).getNameAnimal())) {
					listAnimals.remove(i);
				} else {
					System.out.println("Name animal is null ");
				}
			}
			break;
		case 2:
			String deleteName, checkContinue;
			Boolean check = false;
			do {
				System.out.println("Input name animals want to delete");
				deleteName = sc.nextLine();
				for (int i = 0; i < listAnimals.size(); i++) {
					if (deleteName.equals(listAnimals.get(i).getNameAnimal())) {
						listAnimals.remove(i);
						System.out.println("successful delete");
					} else {
						System.out.println("Unknow");
						break;
					}
				}
				System.out.println("1. Do you want to continue?");
				System.out.println("2. Do you want to exit?");
				checkContinue = sc.nextLine();
				if (checkContinue.equals("1")) {
					check = true;
				} else {
					System.out.println("Exit!");
					check = false;
				}
			} while (check);
			break;
		case 3:
			break;
		default:

		}
	}

	// hàm hiển thị số lượng giới tính của động vật
	public void choiseNumberSex(int userChoise) {
		String type;
		if (userChoise == 1) {
			type = "Bird";
			menu.subMenuShowNumberOfAnimalsBySex2();
			userChoise = sc.nextInt();
			System.out.println("Number sex of animal :" + showNumberSex(type, userChoise));
		}else if(userChoise == 2) {
			type = "fish";
			menu.subMenuShowNumberOfAnimalsBySex2();
			userChoise = sc.nextInt();
			System.out.println("Number sex of animal :" + showNumberSex(type, userChoise));
		}
	}

	public int showNumberSex(String type, int userChoise) {
		int count = 0;
		String sex = "Male";
		for (Animals animals : listAnimals) {
			if (userChoise == 1) {
				if (type.equals(animals.getTypeAnimal()) && sex.equals(animals.getSexAnimal())) {
					count++;
				}
			} else if (userChoise == 2) {
				sex = "Female";
				if (type.equals(animals.getTypeAnimal()) && sex.equals(animals.getSexAnimal())) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ManagerAnimails animails = new ManagerAnimails();
		animails.showMenu();

	}

}
