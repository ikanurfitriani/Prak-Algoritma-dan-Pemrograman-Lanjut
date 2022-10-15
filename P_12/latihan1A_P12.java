public class latihan1A_P12 {
	public static void printArray(int[] Angka, int bil) {
		if (bil != -1) {
			printArray(Angka, bil-1);
			System.out.println(Angka[bil]);
		}
	}
	public static void main(String args[]) {
		int[] Angka = {1, 2, 3, 4, 5, 6, 7, 8};
		printArray(Angka, Angka.length-1);
	}
}