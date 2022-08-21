import java.util.Scanner;
public class Modif_Array2Dimensi1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int A[][] = new int[4][4];
		int B[][] = new int[4][4];
		int kali[][] = new int[4][4];
		System.out.println("Matrix A");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print("Masukan elemen " + i + "." + j + ": ");
				A[i][j] = input.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matrix B");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print("Masukan elemen " + i + "." + j + ": ");
				B[i][j] = input.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matrix A");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(A[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matrix B");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(B[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matrix A * Matrix B");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				kali[i][j] = A[i][1]*B[1][j] + A[i][2]*B[2][j] + A[i][3]*B[3][j];
				System.out.print(kali[i][j] + " ");
			}
			System.out.println();
		}
	}
}