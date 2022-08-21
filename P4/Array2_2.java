import java.util.Scanner;
public class Array2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cats[][] = new String[5][2];
		for (int i=0; i<4; i++) {
			System.out.println("Kucing ke-"+(i+1));
			for (int j=0; j<2; j++) {
				if (j == 0)
					System.out.print("Masukkan nama kucing : ");
				else if (j == 1)
					System.out.print("Masukkan warna kucing : ");
				System.out.print("");
				cats[i][j] = input.next();
			}
		}
		System.out.println();
		System.out.println("Nama Kucing\tWarna");
		for(int i=0; i<4; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(cats[i][j]+"\t\t");
			}
			System.out.println(" ");
		}
	}
}