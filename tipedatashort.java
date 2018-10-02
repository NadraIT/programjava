import java.util.Scanner;


public class tipedatashort {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		short a;
		short b;
		short c;
		//INISIALISASI VALUE
		a = 1300;
		b = 5000;
		//OPERASI VARIABEL
		c = (short)(a+b);
		//MENAMPILKAN HASIL
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Scanner keyboard = new Scanner(System.in);
		System.out.println("tambahkan data");
		float d;
		d = keyboard.nextShort();
		System.out.println("d :" + d);
	}
}
