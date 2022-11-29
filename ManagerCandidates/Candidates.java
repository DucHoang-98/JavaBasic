package ManagerCandidates;// quản lý thí sinh

//tạo 1 class thí sinh
public class Candidates {
	
	//khai báo các phương thức của thí sinh
	private String idCandidates;
	private String nameCandidates;
	private String addressCandidates;
	private String priorityCandidates;
	
	public Candidates(){
		
	}

	public Candidates(String idCandidates, String nameCandidates, String addressCandidates, String priorityCandidates) {
		super();
		this.idCandidates = idCandidates;
		this.nameCandidates = nameCandidates;
		this.addressCandidates = addressCandidates;
		this.priorityCandidates = priorityCandidates;
	}

	public String getIdCandidates() {
		return idCandidates;
	}

	public void setIdCandidates(String idCandidates) {
		this.idCandidates = idCandidates;
	}

	public String getNameCandidates() {
		return nameCandidates;
	}

	public void setNameCandidates(String nameCandidates) {
		this.nameCandidates = nameCandidates;
	}

	public String getAddressCandidates() {
		return addressCandidates;
	}

	public void setAddressCandidates(String addressCandidates) {
		this.addressCandidates = addressCandidates;
	}

	public String getPriorityCandidates() {
		return priorityCandidates;
	}

	public void setPriorityCandidates(String priorityCandidates) {
		this.priorityCandidates = priorityCandidates;
	}

	public void output() {
		System.out.println("Id candidates : " + getIdCandidates());
		System.out.println("Name candidates : " + getNameCandidates());
		System.out.println("Address candidates : " + getAddressCandidates());
		System.out.println("Priority candidates : " + getPriorityCandidates());
	}

	
}