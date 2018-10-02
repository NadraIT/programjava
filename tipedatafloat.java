import java.util.Scanner;


public class tipedatafloat {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL 
		float a;
		float b;
		float hasil;
		//INISIALISASI VALUE
		a = 44;
		b = 40000;
		//OPERASI VARIABEL
		hasil = a * b + b - a;
		//MENAMPILKAN NILAI VARIABEL
		System.out.println("----nilai variabel----");
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("hasil : " + hasil );
		//MENGAMBIL INPUT DARI KEYBOARD
		float c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("C : ");
		c = keyboard.nextFloat();
		System.out.println("c : " + c);
}
}
