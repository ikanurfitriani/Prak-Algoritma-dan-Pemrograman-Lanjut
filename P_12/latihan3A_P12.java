public class latihan3A_P12 {
	public static int elemenTerkecil(int A[], int n){
		if (n==1)
		return A[0];
		return Math.min(A[n-1], elemenTerkecil(A, n-1));
	}
	public static void main(String args[]) {
		int A[] = {61, 35, 88, 28, -12, 73, 10, 6, 20, 17};
		int n = A.length;
		System.out.println("Elemen terkecil adalah "+elemenTerkecil(A, n));
	}
}