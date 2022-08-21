public class praktik3_P12 {
	public static void main(String[] args) {
		System.out.println("Faktorial dari 5 : ");
		int faktorial = 1;
		int N = 5;
		for (int i=1; i<=N; i++)
		if (i<=1)
			System.out.print(i);
		else {
			faktorial = i * faktorial;
			System.out.print(", ");
			System.out.print(faktorial);
		}
		System.out.println();
	}
}