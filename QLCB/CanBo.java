package QLCB;

import java.util.Scanner;

public class CanBo {
	Scanner ip = new Scanner(System.in);
	
	private String maCanBo;
	private String tenCanBo;
	private int tuoiCanBo;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo() {
		
	}

	public CanBo(String maCanBo, String tenCanBo, int tuoiCanBo, String gioiTinh, String diaChi) {
		this.maCanBo = maCanBo;
		this.tenCanBo = tenCanBo;
		this.tuoiCanBo = tuoiCanBo;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getMaCanBo() {
		return maCanBo;
	}

	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

	public String getTenCanBo() {
		return tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	public int getTuoiCanBo() {
		return tuoiCanBo;
	}

	public void setTuoiCanBo(int tuoiCanBo) {
		this.tuoiCanBo = tuoiCanBo;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void nhapThongTin() {
		System.out.println("Nhap ma can bo : ");
		setMaCanBo(ip.nextLine());
		System.out.println("Nhap ten can bo : ");
		setTenCanBo(ip.nextLine());
		System.out.println("Nhap tuoi");
		setTuoiCanBo(Integer.parseInt(ip.nextLine()));
		System.out.println("Nhap gioi tinh nam/nu");
		setGioiTinh(ip.nextLine());
		System.out.println("Nhap dia chi");
		setDiaChi(ip.nextLine());
		 
	}
	
	public void xuatThongTin() {
		System.out.println("Ma can bo : " + getMaCanBo() );
		System.out.println("Ten can bo : " + getTenCanBo() );
		System.out.println("Tuoi : " + getTuoiCanBo());
		System.out.println("Gioi tinh : " + getGioiTinh());
		System.out.println("Dia chi : " + getDiaChi());
	}
	
	
}
