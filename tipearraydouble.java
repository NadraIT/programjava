import java.util.Scanner;


public class tipearraydouble {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL
		double[] data = new double[4];
		//INISIALISASI VALUE
		data[0]= 20.574;
		data[1]= 5.22;
		data[2]= 9.70;
		data[3]= 3.43;
		//OPERASI VARIABEL
		double V = data[0] + data[1];
		//MENAMPILKAN NILAI
		System.out.println("---- operasi matematika------");
		System.out.println(" R : " + data[0]);
		System.out.println(" S : " + data[1]);
		System.out.println(" T : " + data[2]);
		System.out.println(" U : " + data[3]);
		System.out.println(" V : " + V);
		//MENGAMBIL IMPUT DARI KEYBOARD	
		double[] data2= new double[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Tambahkan angka Desimal : ");
		data2[0] = keyboard.nextDouble();
		data2[1] = keyboard.nextDouble();
		System.out.println(" W : " + data2[0]);
		System.out.println(" X : " + data2[1]);
	}
}
