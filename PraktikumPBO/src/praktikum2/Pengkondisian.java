package praktikum2;
import java.util.Scanner;

public class Pengkondisian {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int angka1, angka2, hasil, perhitungan;
	
	System.out.print("Masukan angka 1 : ");
	angka1 = input.nextInt();
	System.out.print("Masukan angka 2 : ");
	angka2 = input.nextInt();
	
	System.out.println("Masukan angka perhitungan : "
			+ "\n 1 : +"
			+ "\n 2 : -"
			+ "\n 3 : *"
			+ "\n 4 : /");
	perhitungan = input.nextInt();
	
	if(perhitungan == 1) {
		hasil = angka1 + angka2;
		System.out.print("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 2) {
		hasil = angka1 - angka2;
		System.out.print("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 3) {
		hasil = angka1 * angka2;
		System.out.print("Hasilnya adalah : "+hasil);
		
	}else if(perhitungan == 4) {
		hasil = angka1 / angka2;
		System.out.print("Hasilnya adalah : "+hasil);
	}
}
}
