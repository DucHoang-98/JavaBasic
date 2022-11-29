package OOP;

import java.util.Scanner;

public class Sinhvien {
	
	// khai báo các biến ( hay còn gọi là thuộc tính của đối tượng)
	private int Id;
	private String hoTen;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	
	//hàm khởi tạo contructor
	public Sinhvien() {
		
	}

	public Sinhvien(int id, String hoTen, double diemToan, double diemLy, double diemHoa) {
		this.Id = id;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	//hàm nhập 
	public void nhap() {
		Scanner ip  = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien : " );
		setId(ip.nextInt());
		System.out.println("Nhap ten sinh vien : ");
		ip.nextLine();
		hoTen = ip.nextLine();
		System.out.println("Nhap diem toan : ");
		diemToan = ip.nextDouble();
		System.out.println("Nhap diem ly : ");
		diemLy = ip.nextDouble();
		System.out.println("Nhap diem hoa");
		diemHoa = ip.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ma sinh vien : " + getId());
		System.out.println("Ten sinhv vien : " + getHoTen());
		System.out.println("Diem toan : " + getDiemToan());
		System.out.println("Diem ly " + getDiemLy());
		System.out.println("Diem hoa : " + getDiemHoa() );
	}
	
	
	
	
}
