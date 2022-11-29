package QuanLySinhVien;

public class SinhVien {
	// khai báo các thuộc tính của đối tượng, 
	private String maSV;
	private String tenSV;
	private String Lop;
	private double diemToan;
	private double diemHoa;
	private double diemLy;
	private String sdt;
	//hàm contructor không có đối số truyền vào
	public SinhVien() {
		
	}
	
	//hàm contructor có đối số truyền vào
	public SinhVien(String maSV, String tenSV, String lop, double diemToan, double diemHoa, double diemLy, String sdt) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.Lop = lop;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;
		this.sdt = sdt;
	}

	// các hàm get và set 
	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public double getDiemLy() {
		return diemLy;
	}
// sau nay tinh diem trung binh, thi 1 method tinh diem trung binh, chua, dang tap lam may cai kia cho oke da, chua co ke thua, xong cai nay, thi qua ke thua 
	// oke, rang vo lam chung vs m :)), tat nghe
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
	
}
