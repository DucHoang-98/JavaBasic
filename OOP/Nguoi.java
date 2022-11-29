package OOP;
// lớp người được khai báo bao gồm các phương thức và thuộc tính chỉ người
public class Nguoi {
	private String ten;
	private String tuoi;
	private String diaChi;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String ten, String tuoi, String diaChi) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void nhap() {
		System.out.println("xin chao");
	}
	
	
	
}
