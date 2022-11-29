package QLCB;

import java.util.Scanner;

public class CongNhan  extends CanBo{
	Scanner ip = new Scanner(System.in);
	
	private int Bac;

	public CongNhan() {
		super();
	}

	public CongNhan(String maCanBo, String tenCanBo, int tuoiCanBo, String gioiTinh, String diaChi, int bac) {
		super(maCanBo, tenCanBo, tuoiCanBo, gioiTinh, diaChi);
		this.Bac = bac;
	}

	public int getBac() {
		return Bac;
	}

	public void setBac(int bac) {
		Bac = bac;
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap cap bac cong nhan");
		setBac(Integer.parseInt(ip.nextLine()));
	}
	
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Cap bac cong nhan : " + getBac());
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Cap bac cong nhan: " + this.Bac;
//	}
}
