import java.util.Scanner;


public class tipearraystring {
	public static void main(String[] args) {
	Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL
		String[] mahasiswa = new String[6];
		//INISIALISASI VALUE
		mahasiswa[0] = "muhammad mohar";
		mahasiswa[1] = "aswad";
		mahasiswa[2] = "aswandi";
		mahasiswa[3] = "udin";
		mahasiswa[4] = "sadly";
		mahasiswa[5] = "rosalina konde";
		//OPERASI VARIABEL
		System.out.println("DAFTAR NIM____");
		String[] nim = {"D0217321","D0217319","D0217011","D0217017","D0217328","D0217012"};
		for (String element: nim) {System.out.println(element);}
		//MENAMPILKAN HASIL
		System.out.println("PEMILIK NIM______");
		for(int i=0;i<mahasiswa.length;i++){System.out.println((mahasiswa[i]));};
		//MENGAMBIL IMPUT DARI KEYBOARD
	    String[] mahasiswa_tambahan = new String[5];
	    Scanner keyboard = new Scanner(System.in);
	    for( int i = 0; i < mahasiswa_tambahan.length; i++ )
	    {System.out.print(i);
	    mahasiswa_tambahan[i] = keyboard.nextLine();}
	    System.out.println("--mahasiswa tambahan--");
	    for(int i=0;i<mahasiswa_tambahan.length;i++){System.out.println(mahasiswa_tambahan[i]);};
	}
}
