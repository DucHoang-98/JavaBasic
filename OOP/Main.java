package OOP;

public class Main {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setTuoi(0); //khi truy cập các biến private ta không thể truyền giá trị trực tiếp vào nó mà phải thông qua hàm get và set
		p.diaChi = "abc"; // public
		p.ten = "ABC"; // default
		p.danToc = "ZYX"; // protected
		
		
		
//		Sinhvien sv = new Sinhvien();
//		sv.nhap();
//		sv.xuat();
		
//		SVien svien = new SVien();
//		svien.nhap();
//		svien.xuat();
		
		
		NhanVien nhanVien = new NhanVien();
		
		nhanVien.nhap();
	}
}
