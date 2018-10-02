import java.util.Scanner;


public class tipedatastring {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		//DEKLARASI VARIABEL
				String nama;
		        String nim;
		        String jurusan;
		        String tempat_lahir;
		        String tanggal_lahir;
		        String bulan_lahir;
		        String tahun_lahir;
		        //INISIALISASI VALUE
		        nama = "mesing";
		        nim =  "D0217215";
		        jurusan = "teknik";
		        tempat_lahir = "kekkes";
		        tanggal_lahir = "20";
		        bulan_lahir = "agustus";
		        tahun_lahir = "1999";
		        //OPERASI VARIABEL
		        String ttl;
		        ttl = (tempat_lahir + "," + tanggal_lahir + "-" + bulan_lahir + "-" + tahun_lahir);
		        //MENAMPILKAN HASIL
		        System.out.println("----- Biodata Mahasiswa-------");
		        System.out.println("Nama : " + nama);
		        System.out.println("NIM : " + nim);
		        System.out.println("Jurusan : " + jurusan);
		        System.out.println("TTL : " + ttl);
		        //MENGAMBIL INPUT DARI KEYBOARD
		        String alamat;
		        Scanner keyboard = new Scanner(System.in);
		        System.out.print("masukkan Alamat : ");
		        alamat = keyboard.next();
		        System.out.println("Alamat : " + alamat);
	}
}
