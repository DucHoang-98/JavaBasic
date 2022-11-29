package Animals;
import java.util.Scanner;

public class Menu {
	public void menu() {
			System.out.println("------------Manager Animals------------");
			System.out.println("1.Add animmals\n" 
					+ "2.Update animals\n" 
					+ "3.Delete animals \n"
					+ "4.Show info animals \n" 
					+ "5.Sort animals by name\n"
					+ "6.Show number of animals by sex \n" 
					+ "7.Exit \n"
					+ "Choose : ");
			
	}

	public  void addSubMenu() {
			System.out.println("1.Add bird");
			System.out.println("2.Add firsh");
			System.out.println("3.Add amphibian");
			System.out.println("4.Add reptile");
			System.out.println("5.Add animal");
			System.out.println("6.Add other");
			System.out.println("7.Back to menu");
			System.out.println("Choise add : ");
	}
	
	public void showSubMenu() {
		System.out.println("1.Show info a animal ");
		System.out.println("2.Show info all animal");
		System.out.println("3.Back to menu");
	}
	
	public void deleteSubMenu() {
		System.out.println("1. Delete a animal");
		System.out.println("2. Delete some animal");
		System.out.println("3. Back to menu");
	}

	public void updateSubMenu() {
		System.out.println("1.Update bird");
		System.out.println("2.Update firsh");
		System.out.println("3.Update amphibian");
		System.out.println("4.Update reptile");
		System.out.println("5.Update animal");
		System.out.println("6.Update other");
		System.out.println("7.Back to menu");
		System.out.println("Choise add : ");
	}
	
	public void updateSubMenu2() {
		System.out.println("1. Name animal : ");
		System.out.println("2. Type animal : ");
		System.out.println("3. Kind of animal : ");
		System.out.println("4. Size animal : ");
		System.out.println("5. Weight animal : ");
		System.out.println("6. Foot animal : ");
		System.out.println("7. Sex animal : ");
		System.out.println("8. Personality animal : ");
		System.out.println("9. Behavior animal : ");
		System.out.println("10. Back to menu");
		System.out.println("Choise : ");
	}
	
	public void sortByNameSubMenu() {
		System.out.println("1.Sort bird");
		System.out.println("2.Sort fish");
		System.out.println("3.Sort");
		System.out.println("4.Sort reptile");
		System.out.println("5.Sort animal");
		System.out.println("6.Sort other");
		System.out.println("7.Sort all");
		System.out.println("8.Back to menu");
		System.out.println("Choise add : ");
	}
	
	
	
	public void subMenuShowNumberOfAnimalsBySex1() {
		System.out.println("1.Show Number Of bird");
		System.out.println("2.Show Number Of fish");
		System.out.println("3.Show Number Of amphibian");
		System.out.println("4.Show Number Of reptile");
		System.out.println("5.Show Number Of animal");
		System.out.println("6.Show Number Of other");
		System.out.println("7.Back to menu");
		System.out.println("Choise add : ");
	}
	
	public void subMenuShowNumberOfAnimalsBySex2() {
		System.out.println("1. Male ");
		System.out.println("2. Female");
		System.out.println("Choise : ");

	}
	
	
	
}
