package ManagerCandidates;

import java.util.Scanner;

public class Main {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		ManagerCadidates managerCadidates = new ManagerCadidates();
		boolean choose = true;
		while(choose) {
			System.out.println("--------Manager Cadidates-------");
			System.out.println("1.Input Cadidates");
			System.out.println("2.Show List Cadidates");
			System.out.println("3.Remove Cadidates By Id");
			System.out.println("4.Out");
			System.out.println("Choose : ");
			int line = Integer.parseInt(sc.nextLine());
			switch (line) {
				case 1: 
					System.out.println("a.Input CadidatesA ");
					System.out.println("b.Input CadidatesB ");
					System.out.println("Choose : ");
					String type = sc.nextLine();
					switch (type) {
						case "a": 
							managerCadidates.addCandidates(candidates("a", sc));
							break;
						case "b":
							managerCadidates.addCandidates(candidates("b", sc));
							break;
						default:
							System.out.println("feals");
					}
					break;
				case 2:
					managerCadidates.showCandidates();
					break;
			default:
				System.out.println("Choose Again!!");
			}
		}
	}
	
	public static Candidates candidates(String ip, Scanner sc) {
		System.out.println("Input Id :");
		String id = sc.nextLine();
		System.out.println("Input Name Cadidates : ");
		String name = sc.nextLine();
		System.out.println("Input Address Cadidates : ");
		String add = sc.nextLine();
		System.out.println("Input prority Cadidates");
		String priority = sc.nextLine();
		if(ip.equals("a")) {
			return new CandidatesA(id, name, add, priority);
		}else if(ip.equals("b")) {
			return new CandidatesB(id, name, add, priority);
		}else {
			return new CandidatesB(id, name, add, priority);
		}
	}

	public static void main(String[] args) {
		Candidates candidatesA = new Candidates("1", "2", "3", "1");
		Candidates candidatesB = new Candidates("2", "2", "2", "2");
		Candidates candidatesC = new Candidates("9", "9", "9", "9");
		ManagerCadidates managerCadidates = new ManagerCadidates();
		managerCadidates.addCandidates(candidatesC);
		managerCadidates.addCandidates(candidatesA);
		managerCadidates.addCandidates(candidatesB);
		managerCadidates.showCandidates();//chạy lại xem nào
		System.out.println("-----------------------");
		managerCadidates.removeCandidates("9");// đoạn này truyền id là 9 nhá
		managerCadidates.showCandidates();
		System.out.println("-----------------------");
		managerCadidates.searchCadidates("2");

	}
}
