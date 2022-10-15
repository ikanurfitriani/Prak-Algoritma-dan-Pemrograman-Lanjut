import java.util.Scanner;
public class tugas1_P12 {
	public static void main(String[] args) {
		System.out.println("|| MENGHITUNG PERPANGKATAN ||");
		Scanner masuk = new Scanner(System.in);
		int hasil = 1;
		int bil, pangkat;
		System.out.print("Masukkan Bilangan : ");
		bil = masuk.nextInt();
		System.out.print("Masukkan Pangkat : ");
		pangkat = masuk.nextInt();
		for(int i=1; i<=pangkat; i++) {
			hasil = hasil*bil;
		}
		System.out.println("================================");
		System.out.println("Hasil dari "+bil+" pangkat "+pangkat+" = "+hasil);
	}
}