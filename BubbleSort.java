import java.util.Scanner;
public class BubbleSort {
	public void bubbleSort(int larik2[]) {
		for (int i=0;i<larik2.length;i++) {
			for (int elemen=0;elemen<larik2.length-1;elemen++) {
				if (larik2[elemen]>larik2[elemen+1])
				tukar(larik2, elemen,elemen+1);
			}
		}
	}
	public void tukar(int larik3[], int satu, int dua) {
		int temp;
		temp = larik3[satu];
		larik3[satu] = larik3[dua];
		larik3[dua] = temp;
	}
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		BubbleSort lrk = new BubbleSort();
		int nilai[]= new int[7];
		System.out.println("Masukkan 7 buah data bilangan");
		for (int i = 0; i < 7; i++) {
			System.out.print("Data Bilangan Ke-"+(i + 1)+" : ");
			nilai[i]=masuk.nextInt();
		}
		System.out.print("\nData bilangan sebelum diurutkan : ");
		for (int i = 0; i < 7; i++)
		System.out.print(nilai[i]+" ");
		System.out.print("\nData bilangan setelah diurutkan : ");
		lrk.bubbleSort(nilai);
		for (int i = 0; i < 7; i++)
		System.out.print(nilai[i]+" ");
		System.out.println("");
	}
}