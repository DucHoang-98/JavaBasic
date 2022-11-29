package QuanLySachBao;

public class ThuVien {
	private String maTailieu;
	private String tenNhaXuatBan;
	private String soBanPhatHanh;
	
	public ThuVien() {
	}

	public ThuVien(String maTailieu, String tenNhaXuatBan, String soBanPhatHanh) {
		super();
		this.maTailieu = maTailieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public String getMaTailieu() {
		return maTailieu;
	}

	public void setMaTailieu(String maTailieu) {
		this.maTailieu = maTailieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public String getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(String soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public void xuatThongTin(){
		System.out.println("Ma tai lieu : " + getMaTailieu());
		System.out.println("Ten nha xuat ban : " + getTenNhaXuatBan());
		System.out.println("So ban phat hanh : " + getSoBanPhatHanh());
	}
}
