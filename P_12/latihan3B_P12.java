public class latihan3B_P12 {
	public static void main(String args[]) {
		int A[] = {73, 10, 8, 20, 48};
		int elemenTerkecil = A[0];
		for (int i=0; i<A.length; i++) {
			if (elemenTerkecil > A[i]) {
				elemenTerkecil = A[i];
			}
		}
		System.out.println("Elemen terkecil adalah "+elemenTerkecil);
	}
}