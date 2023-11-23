package praktikum1;
import java.util.Scanner;


public class Latihan {
 public static void main(String args []) {
// System.outprintln ("Masih Pemula");
// iniliasisasi variabel
	 int angka1, angka2, hasil;
// inisialisasi input user
	 Scanner input = new Scanner(System.in);
// input user
	 System.out.println("Masukan \nAngka 1 : ");
	 angka1 = input.nextInt();
	 System.out.println("Masukan \nAngka 2 : ");
	 angka2 = input.nextInt();
// hasil
	 hasil = angka1 + angka2;
	 System.out.println("Hasilnya Adalah : "+hasil);
	 String namaDepan, namaBelakang, fullName;
	 System.out.println("Masukan Nama Depan : ");
	 namaDepan = input.next();
	 System.out.println("Masukan Nama Belakang : ");
	 namaBelakang = input.next();
	 
	 fullName = namaDepan + " " + namaBelakang;
	 System.out.println(fullName);
	 
	}

}
