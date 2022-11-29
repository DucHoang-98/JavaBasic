package QLCB;

import java.util.Iterator;
import java.util.Scanner;

public class QuanLyCanBo {
	Scanner ip = new Scanner(System.in);
	private CanBo[] danhSachCanBo;
	private int tongCanBo = 0;
	
	public QuanLyCanBo() {
		danhSachCanBo = new CanBo[100];
	}
	//dùm hàm contructor để khai báo giá trị trong mảng canbo
	public QuanLyCanBo(CanBo[] quanLyCanBo, int tongCanBo) {
		this.danhSachCanBo = quanLyCanBo;
		this.tongCanBo = tongCanBo;
	}
	
	public void themCanBo(CanBo canBo) {
		danhSachCanBo[tongCanBo] = canBo;
		tongCanBo++;
	}
	
	// hàm nhap thong tin
	public void nhapThongTin(int soLuong) {
		CanBo canBo = null;
		System.out.println("1. Nhap thong tin cong nhan " );
		System.out.println("2. Nhap thong tin ky su " );
		int chon = Integer.parseInt(ip.nextLine());
		if(chon == 1) {
			// ở đây new canBo từ class CongNhan và gọi lại hàm nhapthong tin ở class CongNhan
			for(int i = 0; i<soLuong;i++) {
				canBo = new CongNhan();
				canBo.nhapThongTin();
				this.themCanBo(canBo);	
			}
		}else if(chon == 2) {
			for(int i = 0; i<soLuong;i++) {
				canBo = new KySu();
				canBo.nhapThongTin();
				this.themCanBo(canBo);
			}
		}else {
			System.out.println("Chon sai roi");
		}
	}
	// hàm xuất thông tin
	public void xuatThongtin() {
		for(int i = 0 ; i < tongCanBo; i++) {
			danhSachCanBo[i].xuatThongTin();
		}
	}
	
	public void timKiemThongTin(String tenCanBo) {
		for(int i = 0; i< tongCanBo; i++) {
			// contentEquals ss nội dung 
			// equals ss nội dung và cả kiểu dữ liệu
			if(tenCanBo.equals(danhSachCanBo[i].getTenCanBo())) {
				danhSachCanBo[i].xuatThongTin();
			}else  {
				System.out.println("Khong co can bo can tim");
				break;
			}
		}
	}
	
	public void menu() {
		int chucNang;
		boolean kiemTra = true;
		do {
			System.out.println("----------Quan Ly Can Bo----------");
			System.out.println("1. Them can bo");
			System.out.println("2. Hien thi thong tin can bo");
			System.out.println("3. Tim can bo theo ten ");
			System.out.println("4. Thoat ");
			System.out.println("Chon chuc nang : ");
			chucNang = Integer.parseInt(ip.nextLine());
			switch (chucNang) {
			case 1: 
				System.out.println("Nhap so luong can bo can them : ");
				int soLuong = Integer.parseInt(ip.nextLine());
				this.nhapThongTin(soLuong);
				break;
			case 2:
				this.xuatThongtin();
				break;
			case 3:
				System.out.println("Nhap ten can tim : ");
				String tenCanBo = ip.nextLine();
				this.timKiemThongTin(tenCanBo);
				break;
			case 4:
				System.out.println("Tam biet");
				kiemTra = false;
				break;
			default:
				System.out.println("Nhap sai, xin moi nhap lai");
				break;
			}
		}while(kiemTra);
	}
}
