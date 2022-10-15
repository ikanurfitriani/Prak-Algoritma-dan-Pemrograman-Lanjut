import java.util.Scanner;
public class Latihan3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] angka = new String[8][3];
		for(int i=0;i<8;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Input Angka baris["+i+"]"+" kolom["+j+"]= ");
				angka[i][j] = input.next();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Hasil Nilai Inputan");
		for(int i=0;i<8;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("|"+angka[i][j]+"|");
			}
			System.out.println("");
		}
	}
}