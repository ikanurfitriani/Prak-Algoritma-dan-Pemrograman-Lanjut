public class latihan2A_P12 {
	public static void dibalik(char[] A, int B, int C) {
		if (B < C) {
			char ch = A[B];
			A[B] = A[C];
			A[C] = ch;
			dibalik(A, B + 1, C - 1);
		}
	}
	public static String dibalik(String str) {
		if (str.isEmpty()) {
			return str;
		}
		char[] A = str.toCharArray();
		dibalik(A, 0, A.length - 1);
		return String.copyValueOf(A);
	}
	public static void main(String[] args) {
		String str = "Cinta Ika yang terhalang perbedaan Agama";
		str = dibalik(str);
		System.out.println("String Yang Dibalik : " + str);
	}
}