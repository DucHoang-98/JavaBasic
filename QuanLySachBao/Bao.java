package QuanLySachBao;

public class Bao extends ThuVien{

	private String ngayPhatHanh;

	public Bao() {
		super();
	
	}

	public Bao(String maTailieu, String tenNhaXuatBan, String soBanPhatHanh, String ngayPhatHanh ) {
		super(maTailieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Ngay phat hanh : " + getNgayPhatHanh());
	}
	
	
	
	
	
}
