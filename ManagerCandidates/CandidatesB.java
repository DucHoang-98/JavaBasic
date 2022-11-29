package ManagerCandidates;

public class CandidatesB extends Candidates{

	//biến chứa từ khóa final không thể thây đổi giá trị
	private final String math = "Math";
	private final String chemistry = "Chemistry";
	private static final String biolory = "Biolory";
	
	public CandidatesB() {
		super();
	}
	public CandidatesB(String idCandidates, String nameCandidates, String addressCandidates,
			String priorityCandidates) {
		super(idCandidates, nameCandidates, addressCandidates, priorityCandidates);

	}
	@Override
	public void output() {
		super.output();
		System.out.println("Subject : " + math + "-" + chemistry + "-" + biolory);
	}
	
	
}
