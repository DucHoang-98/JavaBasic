package OOP;
// class nhanvien được khai báo kế thừa class Nguoi qua từ khóa extends
public class NhanVien extends Nguoi{
	private String diaChiLamViec;
	private String chucVu;
	private double luong;
	
	public NhanVien() {
		
	}

	public NhanVien(String diaChiLamViec, String chucVu, double luong) {
		this.diaChiLamViec = diaChiLamViec;
		this.chucVu = chucVu;
		this.luong = luong;
	}

	
	public void nhap() {
		super.nhap();
	}
	
	
	
}
