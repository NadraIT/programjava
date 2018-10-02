import java.util.Scanner;


public class tipedatadouble {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL
		double r;
		double s;
		//INISIALISASI VALUE
		r  = 68.495;
		s  = 9.11;
		//OPERASI VARIABEL
		double t = r + s;
		//MENAMPILKAN NILAI
		System.out.println("---- operasi matematika------");
		System.out.println(" R : " + r);
		System.out.println(" S : " + s);
		System.out.println(" T : " + t);
		//MENGAMBIL IMPUT DARI KEYBOARD	
		double u;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Tambahkan angka Desimal : ");
		u = keyboard.nextDouble();
		System.out.println(" U : " + u);
	}
}
