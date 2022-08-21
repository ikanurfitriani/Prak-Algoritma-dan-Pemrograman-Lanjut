public class Nyoba1 {
	public static void main(String[] args) {
		int i, j;
		System.out.println("Pengulangan Bersarang Membentuk Pola");
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
					System.out.print(" ");
			}
			for (int k = 1; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println("akakom ");
		}
	}
}