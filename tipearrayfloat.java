import java.util.Scanner;


public class tipearrayfloat {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
	//DEKLARASI VARIABEL 
			float[] data = new float[4];
			//INISIALISASI VALUE
		    data[0] = 50;
		    data[1] = 26000;
		    data[2] = 576;
		    //OPERASI VARIABEL
		    data[3] = data[0] + data[2];
		    //MENAMPILKAN NILAI VARIABEL
		    System.out.println("----nilai variabel----");
		    System.out.println("A : " + data[0]);
		    System.out.println("B : " + data[1]);
		    System.out.println("C : " + data[3]);
		    //MENGAMBIL INPUT DARI KEYBOARD
		    float[] data2 = new float[2];
		    Scanner keyboard = new Scanner(System.in);
		    System.out.println("Tambahkan data : ");
		    data2[0] = keyboard.nextFloat();
		    data2[1] = keyboard.nextFloat();
		    System.out.println("D : " + data[0]);
		    System.out.println("E : " + data[1]);
	}
}
