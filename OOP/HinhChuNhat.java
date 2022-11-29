package OOP;

public class HinhChuNhat {
	//class là 1 bản thiết kế bao gồm biến và phương thức
	//object là 1 thực thể được tạo nên từ class bao gồm thuộc tính và hành vi
	
	// biến đối tượng và khi tạo object thì được gọi là thuộc tính
	double chieuDai;
	double chieuRong;
	
	//hàm contructor: hay gọi làm hàm khởi tạo, dùng để tạo giá trị cho các biến intance khi new 1 đối tượng
	//contructor mặc định: 
	public HinhChuNhat() {
		
	}
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	 	 
	
	// biến static : hay còn được gọi là biến của class, ta có thể gọi biến static thông qua tên class mà không cần new đối tượng
	static int count = 0;
	// hàm static hay còn gọi là hàm class, ta có thể gọi hàm static thông qua tên class mà không cần new đối tượng
	public static double chuVi(double chieuDai, double chieuRong) {
		return chieuDai*chieuRong;
	}
	
	//hàm get được khai báo dùng để lấy các giá trị của biến đã được khai báo
	public double getChieuDai() {
		return chieuDai;
	}
	// từ khóa this dùng để trỏ đến các đối tượng chưa trong class, hàm set được khai báo dùng để truyền giá trị cho các biến intance 
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	//phương thức của đối tượng sau khi tạo object thì được gọi là hành vi
	public void dienTich(double chieuDai, double chieuRong) {
		System.out.println("Dien tich hinh vuong :" + chieuDai * chieuRong);
	}
	
	public static void main(String[] args) {
		//dùng biến new để khởi tạo đối tượng
		
		HinhChuNhat hinhChuNhat = new HinhChuNhat();
		HinhChuNhat hinhChuNhat2 = new HinhChuNhat();
		
		hinhChuNhat.dienTich(2, 4);
		hinhChuNhat2.dienTich(5, 6);
		
		
		HinhChuNhat hinhChuNhat3 = new HinhChuNhat();
		// hàm và biến intance chỉ được dùng khi new 1 đối tượng (Get/set)
		hinhChuNhat3.setChieuDai(4);
		hinhChuNhat3.setChieuRong(5);
		
		System.out.println("chiều dài :" + hinhChuNhat3.getChieuDai());
		System.out.println("chiều rộng : " + hinhChuNhat3.getChieuRong());
		
		
		
		HinhChuNhat hinhChuNhat4 = new HinhChuNhat(); // contructor mặc định
		//khi dùng contructor mặc định ta dùm các hành set get để truyền và gọi giá trị
		hinhChuNhat4.setChieuDai(10);
		System.out.println(hinhChuNhat4.getChieuDai());
		
		//contructor có giá trị truyền vào
		HinhChuNhat hinhChuNhat5 = new HinhChuNhat(7 , 9);
	}
	
}
