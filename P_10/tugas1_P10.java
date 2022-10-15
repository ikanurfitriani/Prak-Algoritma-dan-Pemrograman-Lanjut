import java.util.Scanner;
public class tugas1_P10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[10];
		char [] keluar = new char[10];
		int i = 0, j = 0;
		while (i<10){
			System.out.print("data ke-"+(i+1)+" : ");
			data[i] = scan.nextInt();
			i++;
		}
		System.out.println("=====================");
		System.out.println("| Hasil Konversi |");
		System.out.println("=====================");
		keluar = konversiNilai(data);
		//tampil hasil
		while (j<10){
			System.out.println(data[j]+" "+keluar[j]);
			j++;
		}
	}
	public static char[] konversiNilai(int[] x) {
		int n = x.length;
		char hasil[] = new char[n];
		int i = 0;
		while (i<n) {
			switch(x[i]) {
				case 85: case 90: case 95: case 100:
					hasil[i] = 'A';
					break;
				case 65: case 70: case 75: case 80:
					hasil[i] = 'B';
					break;
				case 45: case 50: case 55: case 60:
					hasil[i] = 'C';
					break;
				case 25: case 30: case 35: case 40:
					hasil[i] = 'D';
					break;
				case 5: case 10: case 15: case 20:
					hasil[i] = 'E';
					break;
				default:
					System.out.println("Nilai " + x[i] + " belum dikonversikan");
			}
			i++;
		}
		return hasil;
	}
}