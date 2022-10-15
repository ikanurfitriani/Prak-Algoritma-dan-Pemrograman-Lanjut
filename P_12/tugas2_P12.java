import java.util.Scanner;
public class tugas2_P12 {
	public static void main(String[] args) {
		System.out.println("     || CEK PALINDROME ||	");
		Scanner masuk = new Scanner(System.in);
		String kata, hasil_cekKata = "";
		System.out.print("Masukkan Kata/Kalimat : ");
		kata = masuk.nextLine();
		int panjang = kata.length();
		for(int i=panjang-1; i>=0; i--) {
			hasil_cekKata = hasil_cekKata + kata.charAt(i);
		}
		System.out.println("================================");
		if(kata.equals(hasil_cekKata)) {
			System.out.println(hasil_cekKata + " = Adalah Palindrome");
		} else {
			System.out.println(hasil_cekKata + " = BUKAN Palindrome");
		}
	}
}