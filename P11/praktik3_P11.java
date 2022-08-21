public class praktik3_P11 {
	public static long faktorial(long N) {
		if (N <= 1) {
			return 1;
		} else {
			return N * faktorial(N-1);
		}
	}
	public static void faktorialFaktor(long N) {
		if (N <= 1) {
			System.out.print(1);
		} else {
			faktorialFaktor(N-1);
			System.out.print(", ");
			System.out.print(faktorial(N));
		}
	}
	public static void main(String[] args) {
		System.out.println("Faktorial dari 5 : ");
		faktorialFaktor(5);
		System.out.println();
	}
}