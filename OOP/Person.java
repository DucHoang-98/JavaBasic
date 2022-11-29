package OOP;

public class Person {
	String ten; // loại default
	private int tuoi; // loại private
	protected String danToc; // loại protected
	public String diaChi; //loại public
	
	public Person() {
		
	}
	
	public Person(String ten, int tuoi, String danToc, String diaChi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.danToc = danToc;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void anUong() {
		
	}
	
	private void noiChuyen() {
		
	}
	
	protected void diLai() {
		
	}
	
	void troChuyen() {
		
	}
}
