import java.util.Scanner;


public class tipedatainteger {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL
		int i;
		int j;
		int k;
		//INISIALISASI VALUE
		i = 33;
		j = 55;
		k = 55;
		//OPERASI VARIABEL
		int l = j + k / 2 - i * 3;
		//MENAMPILAKAN NILAI VARIABEL
		System.out.println("---Nilai Variabel---");
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("k : " + k);
		System.out.println("l : " + l);
		//MENGAMBIL VARIABEL DARI INPUT KEYBOARD
		int m;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan bilangan untuk menambah variabel : ");
		m = keyboard.nextInt();
		System.out.println("m : " + m);
	}
}
