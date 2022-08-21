public class latihan2B_P12 {
	public static void main(String[] args) {
		String str = "Cinta Ika yang terhalang perbedaan Agama";
		int n = str.length();
		char[]A = str.toCharArray();
		char ch;
		for(int B=0, C=n-1; B<C; B++, C--){
			ch = A[B];
			A[B] = A[C];
			A[C] = ch;
		}
		System.out.print("String Yang Dibalik : ");
		System.out.println(A);
	}
}
