package QLCB;

public class KySu extends CanBo{
	
	private String nganhDaoTao;

	public KySu() {
		super();
	}

	public KySu(String maCanBo, String tenCanBo, int tuoiCanBo, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(maCanBo, tenCanBo, tuoiCanBo, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;	
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap chuyen nganh dao tao : ");
		setNganhDaoTao(ip.nextLine());
	}
	
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Nganh dao tao");
	}
	
	

}
