package praktikum3;

import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		inisialisasi
		int angka1, angka2, hasil, perhitungan, perulangan;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Perulangan : ");
		 perulangan = input.nextInt();
		 
//	perulanganfor
	for(int i = 1; i<=perulangan;i++) {
//		input user
		 System.out.print("Masukan Angka 1 : ");
		 angka1 = input.nextInt();
		 System.out.print("Masukan Angka 2 : ");
		 angka2 = input.nextInt();
		 System.out.print("list perhitungan : "
					+ "\n 1 : pertambahan"
					+ "\n 2 : pengurangan"
					+ "\n 3 : perkalian"
					+ "\n 4 : pembagian"
					+ "\n Masukkan angka perhitungan : ");
		perhitungan = input.nextInt();
		
		  if(perhitungan == 1) {
			 hasil = angka1 + angka2;
			 System.out.println("Hasilnya adalah : "+hasil);		 
			 
	}else if(perhitungan == 2) {
			 hasil = angka1 - angka2;
			 System.out.println("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 3) {
		     hasil = angka1 * angka2;
		     System.out.println("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 4) {
		    hasil = angka1 / angka2;
		    System.out.println("Hasilnya adalah : "+hasil);
		
	}
		
		}
	}
}