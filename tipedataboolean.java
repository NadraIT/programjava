import java.util.Scanner;


public class tipedataboolean {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL
		int i;
		int j;
		//INISIALISASI VARIABEL
		i = 0;
		j = 9;
		//OPERASI VARIABEL LOGIKA AND & OR
		boolean test_and = false;
		boolean test_or = false;
		test_and = (i < 11) && (j < 7);
		test_or = (i < 11) || (j < 7);
		//MENAMPILKAN VARIABEL & TEST
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("Logika AND :" + test_and);
		System.out.println("Logika OR : " + test_or);
		//MENDAPATKAN INPUT DARI KEYBOARD
		int k;
		boolean and = false;
		boolean or = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nilai Variabel");
		System.out.print("k :");
		k = keyboard.nextInt();
		and = (k < 10) && (j++ < k);
		or = (k < 10) || (j++ < k);
		System.out.println("k : " + k);
		System.out.println("Logika AND : " + and);
		System.out.println("Logika OR : " + or);
	}
}
