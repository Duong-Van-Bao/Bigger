import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 *Bước 1: Tạo biến d1, d2, bigger
		 *Bước 2: In thông báo nhập số d1
		 *Bước 3: Cho người dùng nhập và gắn vào d1
		 *Bước 4: In thông báo nhập d2
		 *Bước 5: Cho người dùng nhập và gắn vào d2
		 *Bước 6: Xét d1 > d2 hay không
		 *Bước 7: Nếu (5) sai thì gán bigger = d2
		 *Bước 8: Ngược lại bigger = d1
		 * Bước 9: Xuất ra kêt quả
		 **/

		int d1;
		int d2;
		int bigger;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào d1 = ");
		d1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập vào d2 = ");
		d2 = Integer.parseInt(scan.nextLine());
		
		if(d1>d2) {
			bigger = d1;
		} else {
			bigger = d2;
		}
		
		System.out.println("Số lớn nhất là: " + bigger);
	}

}
