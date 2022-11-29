package QuanLySachBao;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class QuanLyThuVien {
	Scanner ip = new Scanner(System.in);

	private ThuVien[] danhSachQuanLy;
	private int tongSach;

	public QuanLyThuVien() {

	}

	public QuanLyThuVien(ThuVien[] danhSachQuanLy, int tongSach) {
		this.danhSachQuanLy = danhSachQuanLy;
	}

	public void them(ThuVien thuVien) {
		danhSachQuanLy[tongSach] = thuVien;
		tongSach++;
	}

	public void xuatThongTin() {
		for (int i = 0; i < tongSach; i++) {
			danhSachQuanLy[i].xuatThongTin();
		}
	}

	public void xoaTaiLieu(String maTaiLieu) {
		for(int i = 0; i<tongSach ; i++) {
			if(maTaiLieu.equals(danhSachQuanLy[i].getMaTailieu())) {
				for(int j = i; j<tongSach -1 ; j++) {
					danhSachQuanLy[i] = danhSachQuanLy[j+1];
					tongSach++;
					System.out.println("Xoa thanh cong");
				}
				break;
			}else {
				System.out.println("Khong co loai sach can xoa");
				break;
			}
			
		}
	}
	public void menu() {
		ThuVien thuVien = null;
		boolean kiemTra = true;
		while (kiemTra) {
			System.out.println("1. Them cac loai sach bao");
			System.out.println("2. Xuat thong tin");
			System.out.println("3. Xoa thong tin");
			System.out.println("4. Thoat");
			System.out.println("Xin moi lua chon cac chuc nang : ");
			int chon = Integer.parseInt(ip.nextLine());
			switch (chon) {
			case 1: {
				System.out.println("a. Them sach vao thu vien : ");
				System.out.println("b. Them bao vao thu vien : ");
				System.out.println("c. Them tap chi vao thu vien : ");
				String them = ip.nextLine();
				switch (them) {
				case "a": {
					System.out.println("Nhap ma tai lieu sach : ");
					String maTaiLieu = ip.nextLine();
					System.out.println("Ten nha xuat ban sach : ");
					String tenNhaXuatBan = ip.nextLine();
					System.out.println("So ban phat hanh : ");
					String soBanPhatHanh = ip.nextLine();
					System.out.println("Ten tac gia : ");
					String tenTacGia = ip.nextLine();
					System.out.println("So trang : ");
					int soTrang = Integer.parseInt(ip.nextLine());
					thuVien = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
					this.them(thuVien);
					break;
				}
				case "b": {
					System.out.println("Nhap ma tai lieu bao : ");
					String maTaiLieu = ip.nextLine();
					System.out.println("Ten nha xuat ban bao : ");
					String tenNhaXuatBan = ip.nextLine();
					System.out.println("So ban phat hanh : ");
					String soBanPhatHanh = ip.nextLine();
					System.out.println("So ban phat hanh : ");
					String ngayPhatHanh = ip.nextLine();
					thuVien = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
					this.them(thuVien);
					break;
				}
				case "c": {
					System.out.println("Nhap ma tai lieu tap chi : ");
					String maTaiLieu = ip.nextLine();
					System.out.println("Ten nha xuat ban tap chi : ");
					String tenNhaXuatBan = ip.nextLine();
					System.out.println("So ban phat hanh : ");
					String soBanPhatHanh = ip.nextLine();
					System.out.println("So phat hanh : ");
					int soPhatHanh = Integer.parseInt(ip.nextLine());
					System.out.println("Thang phat hanh : ");
					String thangPhatHanh = ip.nextLine();
					thuVien = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
					this.them(thuVien);
					break;
				}
				default:
					System.out.println("Nhap sai roi vui long nhap lai");
					break;
				}
				break;
			}
			case 2: {
				this.xuatThongTin();
				break;
			}
			case 3:{
				System.out.println("Nhap ma tai lieu can xoa :");
				String maTaiLieu = ip.nextLine();
				this.xoaTaiLieu(maTaiLieu);
				break;
			}
			case 4:{
				System.out.println("Tam Biet!!");
				kiemTra = false;
				break;
			}
			default:
				System.out.println("Nhap Lai");
			}
		}
	}
}
