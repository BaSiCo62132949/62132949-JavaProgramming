import java.util.ArrayList;
public class CT {

	public static void main(String[] args) {
		// Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;

		//Xin mới
		dsSanPham = new ArrayList<SanPham>();

		SanPham sp1 = new SanPham(0, "Kem", "Giải khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);

		//Thêm vào Arrylist
		dsSanPham.add(new SanPham(0, "Kem", "Giải khát", null));
		dsSanPham.add(new SanPham(1, "Cơm", "Đồ ăn", null));
		dsSanPham.add(new SanPham(2, "Phở", "Đồ ăn", null));

//		for (SanPham x: dsSanPham)
//			System.out.println(x.toString());

		for (int i=0; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}

	}

}
