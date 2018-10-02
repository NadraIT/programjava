import java.util.Scanner;


public class tipearraylong {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL
			long[] data= new long[3];
			//INISIALISASI VALUE
			data[0] = 40000000;
			data[1] = 70000000;
			//OPERASI VARIABEL
			data[2] = (long)(600000-4000000);
			//MENAMPILKAN HASIL
			System.out.println("L1 : " + data[0]);
			System.out.println("L2 : " + data[1]);
			System.out.println("L3 : " + data[2]);
			//MENGAMBIL IMPUT DARI KEYBOARD
			long[] data2 = new long[2];
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Tambahkan data Long : ");
			data[0] = keyboard.nextLong();
			data[1] = keyboard.nextLong();
			System.out.println("Data tambahan-----");
			System.out.println("L4 : " + data[0]);
			System.out.println("L4 : " + data[1]);

	}
}
