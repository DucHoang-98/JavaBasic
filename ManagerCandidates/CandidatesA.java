package ManagerCandidates;

import java.util.ArrayList;
import java.util.List;

public class CandidatesA extends Candidates{
	public static CandidatesA abc;
	public static String str; // Value?
	public static String str1 = null;// null là 1 thực thể hoàn toàn chưa tồn tại. 
	public static String str2 = "";//
	
	public static double k;
	public static void main(String[] args) {
		System.out.println(String.valueOf(k));
		if (str2.equals(str)) {// dead
			System.out.println("OK");
		}
		if (str1.equals(str2)) {// Here
			System.out.println("OK");
		}
		
//		if ("1".equals("2")) {
//			System.out.println("OK");
//		}
//		if ("2".equals("1")) {
//			System.out.println("OK");
//		}
	}
	
	{
		// Non-static
		System.out.println("abc");
	}
	// property chứa từ khóa final sẽ không được thây đối giá trị của chúng, 
	private final String math = "Math";
	private final String physical = "Physical";
	private final String chemistry = "Chemistry";
	
	public CandidatesA() {
		super();
	}
	//vì giá trị của các biến là mặc định nên ở contructor không khai báo lại 
	public CandidatesA(String idCandidates, String nameCandidates, String addressCandidates, String priorityCandidates) {
		super(idCandidates, nameCandidates, addressCandidates, priorityCandidates);
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Subject : " + math + "-" + physical + "-" + chemistry );
	}

	
}
