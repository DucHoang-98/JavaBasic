package QuanLySachBao;

public class TapChi extends ThuVien{
	
	private int soPhatHanh;
	private String thangPhatHanh;
	
	public TapChi() {
		super();
	}
	
	public TapChi(String maTailieu, String tenNhaXuatBan, String soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
		super(maTailieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("So phat hanh : " + getSoPhatHanh());
		System.out.println("Thang phat hanh : " + getThangPhatHanh());
	}
	

}
