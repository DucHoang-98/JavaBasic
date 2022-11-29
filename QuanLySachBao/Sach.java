package QuanLySachBao;

public class Sach extends ThuVien{
	
	private String tenTacGia;
	private int soTrang;
	
	public Sach() {
		super();
	}
	
	public Sach(String maTailieu, String tenNhaXuatBan, String soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTailieu, tenNhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public void xuatThongTin(){
		super.xuatThongTin();
		System.out.println("Ten tac gia : " + getTenTacGia());
		System.out.println("So trang : " + getSoTrang());
	}
	
}
