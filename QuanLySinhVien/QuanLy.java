package QuanLySinhVien;

import java.awt.im.InputContext;
import java.util.Scanner;

public class QuanLy {
	Scanner ip = new Scanner(System.in);
	// tao mang sinh vien
	private SinhVien[] danhSachSinhVien = new SinhVien[100];
	// tong sinh vien duoc nhap vao
	private int tongSinhVien = 0;
	//class quan ly tao constucto
	public void themSinhVien(SinhVien sv) {
		tongSinhVien++;
		danhSachSinhVien[tongSinhVien] = sv;
	}

	public void nhapSinhVien(String soLuong) {
		SinhVien sv;
		for (int i = 1; i <= Integer.parseInt(soLuong); i++) {
			sv = new SinhVien(); 
			System.out.println("Nhap ma sinh vien : ");
			sv.setMaSV(ip.nextLine());
			System.out.println("Nhap ten sinh vien : ");
			sv.setTenSV(ip.nextLine());
			System.out.println("Nhap so dien thoai : ");
			sv.setSdt(ip.nextLine());
			System.out.println("Nhap diem toan : ");
			sv.setDiemToan(Double.parseDouble(ip.nextLine()));
			System.out.println("Nhap diem hoa : ");
			sv.setDiemHoa(Double.parseDouble(ip.nextLine())); 
			System.out.println("Nhap diem ly");
			sv.setDiemLy(Double.parseDouble(ip.nextLine()));
			this.themSinhVien(sv);
		}
	}

	public void xuatSinhVien() {
		for (int i = 1; i <= tongSinhVien; i++) {
			System.out.println("Ma sinh vien : " + danhSachSinhVien[i].getMaSV());
			System.out.println("Ten sinh vien : " + danhSachSinhVien[i].getTenSV());
			System.out.println("Diem hoa : " + danhSachSinhVien[i].getDiemHoa());
			System.out.println("Diem ly : " + danhSachSinhVien[i].getDiemLy());
			System.out.println("Diem toan : " + danhSachSinhVien[i].getDiemToan());
			System.out.println("So dien thoai : " + danhSachSinhVien[i].getSdt());
		}
	}

		//tim kiem sinh vien theo ma sinh vien
	public void timKiemSinhVien(String maSinhVien) {
		for(int i = 1 ; i <= tongSinhVien ; i++) {
			if( maSinhVien.equals(danhSachSinhVien[tongSinhVien].getMaSV())) {
				System.out.println("Ma sinh vien : " + danhSachSinhVien[i].getMaSV());
				System.out.println("Ten sinh vien : " + danhSachSinhVien[i].getTenSV());
				System.out.println("Diem hoa : " + danhSachSinhVien[i].getDiemHoa());
				System.out.println("Diem ly : " + danhSachSinhVien[i].getDiemLy());
				System.out.println("Diem toan : " + danhSachSinhVien[i].getDiemToan());
				System.out.println("So dien thoai : " + danhSachSinhVien[i].getSdt());
			}
		}
	}
	
	// chinh sua thong tin sinh vien
	public void chinhSuaThongTin(String maSinhVien) {
		for(int i = 1; i<= tongSinhVien ;i++) { 
			//khi so s??nh chu???i ta d??ng equals ????? ss c??c gi?? tr??? c???a String
			// kh??ng n??n d??ng == ????? ss c??c gi?? tr??? c???a String v?? n?? s??? ss c??? v??? tr?? c???a bi???n
			if(maSinhVien.equals(danhSachSinhVien[tongSinhVien].getMaSV())) {
				System.out.println("Nhap ten sinh vien : ");
				danhSachSinhVien[i].setTenSV(ip.nextLine());
				System.out.println("Nhap so dien thoai : ");
				danhSachSinhVien[i].setSdt(ip.nextLine());
				System.out.println("Nhap diem toan : ");
				danhSachSinhVien[i].setDiemToan(Double.parseDouble(ip.nextLine()));
				System.out.println("Nhap diem hoa : ");
				danhSachSinhVien[i].setDiemHoa(Double.parseDouble(ip.nextLine()));
				System.out.println("Nhap diem ly");
				danhSachSinhVien[i].setDiemLy(Double.parseDouble(ip.nextLine()));
			}
		}
	}
	
	//x??a sinh vi??n
	public void deleteSinhVien(String maSinhVien) {
		//Duy???t m???ng t??? 0 ?????n h???t
		for(int i=1; i<= tongSinhVien; i++) {
			//n???u id nh???p v??o b???ng id trong m???ng th?? x??a
			if(maSinhVien.equals(danhSachSinhVien[i].getMaSV())) {
				//c???p nh???t l???i v??? tr?? trong m???ng
				for(int j=i; j<danhSachSinhVien.length-1; j++) {
					//g??n sinh vi??n th??? i b???ng sinh vi??n th??? j +1
					danhSachSinhVien[i] = danhSachSinhVien[j+1];
					tongSinhVien --;
					System.out.println("X??a th??nh c??ng!");
					break;
				}
		
			}
		}
	}

	public void menu() {
		boolean kiemTra = true;
		do {
			System.out.println("------------------Menu nhap xuat thong tin sinh vien------------------ ");
			System.out.println("1. Them thong tin sinh vien");
			System.out.println("2. Xuat thong tin sinh vien");
			System.out.println("3. Tim kiem sinh vien theo ma sinh vien");
			System.out.println("4. Chinh sua thong tin sinh vien theo ma sinh vien");
			System.out.println("5. Xoa sinh vien");
			System.out.println("8. Thoat");
			System.out.println("Nhap menu : ");
			String chon = ip.nextLine();
			switch (chon) {
			case "1": 
				System.out.println("Them bao nhieu sinh vien : ");
				String soLuong = ip.nextLine(); 
				nhapSinhVien(soLuong);
				break;
			case "2":
				this.xuatSinhVien();
				break;
			case "3": 
				String timKiem;
				System.out.println("Nhap ma sinh vien can tim : ");
				timKiem = ip.nextLine();
				timKiemSinhVien(timKiem);
				break;
			case "4": 
				String chinhsua;
				System.out.println("Nhap ma sinh vien can chinh sua : ");
				chinhsua = ip.nextLine();
				chinhSuaThongTin(chinhsua);
				break;
			case "5" : {
				String xoaSinhvien;
				System.out.println("Nhap ma sinh vien can xoa : ");
				xoaSinhvien = ip.nextLine();
				deleteSinhVien(xoaSinhvien);
				break;
			}
			default:
				System.out.println("Chuc ban vui ve");
				kiemTra = false;
				break;
			}
		} while (kiemTra);

	}

	public static void main(String[] args) {
		QuanLy quanLy = new QuanLy();
		quanLy.menu();
	}
}
