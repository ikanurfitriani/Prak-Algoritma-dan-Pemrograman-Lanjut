import java.util.Scanner;
public class Array2_rev {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jml, banyak=2;
		System.out.print("Masukkan Jumlah Kucing : ");
		jml = input.nextInt();
		System.out.println();
		String cats[][]= new String[jml][banyak];
		for (int i=0; i<jml; i++) {
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
		for(int i=0; i<jml; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(cats[i][j]+"\t\t");
			}
			System.out.println(" ");
		}
	}
}