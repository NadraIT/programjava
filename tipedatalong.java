import java.util.Scanner;


public class tipedatalong {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		//DEKLARASI VARIABEL
		long l1;
		long l2;
		long l3;
		//INISIALISASI VALUE
		l1 = 50000000;
		l2 = 80000000;
		//OPERASI VARIABEL
		l3 = (long)(l2-500000);
		//MENAMPILKAN HASIL
		System.out.println("L1 : " + l1);
		System.out.println("L2 : " + l2);
		System.out.println("L3 : " + l3);
		//MENGAMBIL IMPUT DARI KEYBOARD
		long l4;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan data Long : ");
		l4 = keyboard.nextLong();
		System.out.println("Data tambahan-----");
		System.out.println("L4 : " + l4);
	}
}
