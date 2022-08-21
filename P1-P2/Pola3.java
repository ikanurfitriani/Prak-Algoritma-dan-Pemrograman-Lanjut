public class Pola3 {
	public static void main(String[] args) {
		int i, j;
		System.out.println("Pengulangan Bersarang Membentuk Pola");
		for (i = 1; i <= 5; i++) {
			for (j = 1; j < i; j++) {
					System.out.print(" ");
			}
			for (int k = i; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println("akakom ");
		}
	}
}