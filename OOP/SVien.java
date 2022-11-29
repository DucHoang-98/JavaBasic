package OOP;

import java.util.Scanner;

public class SVien {
	Scanner ip = new Scanner(System.in);
	// khai báo các thuộc tính của đối tượng
	private int Id;
	private String tenSV;	
	private double diemToan;
	private double diemHoa;
	private double diemLy;
	
	// hàm dựng contructor không đối số
	public SVien() {
		
	}
	// hàm dựng có đối số
	public SVien(int id, String tensv, double diemtoan, double diemhoa, double diemly) {
		this.Id = id;
		this.tenSV = tensv;
		this.diemToan = diemtoan;
		this.diemHoa = diemhoa;
		this.diemLy = diemly;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	public double getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	
	// hàm tính điểm trung bình 
	public void diemTrungBinh(double diemToan, double diemLy, double diemHoa) {
		System.out.println("Diem trung bình 3 mon la : " + (diemToan+diemHoa+diemLy)/3);
	}
	
	//hàm nhập
	public void nhap() {
		System.out.println("Ma sinh vien : ");
		Id = Integer.parseInt(ip.nextLine());
		System.out.println("Ten sinh vien :");
		tenSV = ip.nextLine();
		System.out.println("Diem Toan : ");
		diemToan = ip.nextDouble();
		System.out.println("Diem Hoa : ");
		diemHoa = ip.nextDouble();
		System.out.println("Diem Ly :");
		diemLy = ip.nextDouble();
		ip.close();
	}
	
	// hàm xuất
	public void xuat() {
		System.out.println("Ma sinh vien la : " + getId());
		System.out.println("Ten sinh vien la : "  + getTenSV());
		System.out.println("Diem Toan la : " + getDiemToan());
		System.out.println("Diem Hoa la : " + getDiemHoa());
		System.out.println("Diem Ly la : " + getDiemLy());
		diemTrungBinh(diemToan, diemLy, diemHoa);
	}
}
