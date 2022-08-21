public class latihan1_P11 {
	public static int pangkat(int A, int B) {
		if (B == 0) {
			return 1;
		} else {
			return A * pangkat(A, B-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("Hasil 1 pangkat 2 = " + pangkat(1,2));
		System.out.println("Hasil 5 pangkat 1 = " + pangkat(5,1));
		System.out.println("Hasil 7 pangkat 4 = " + pangkat(7,4));
		System.out.println("Hasil 14 pangkat 5 = " + pangkat(14,5));
	}
}