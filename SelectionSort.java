import java.util.Scanner;
public class SelectionSort {
	public void selectionSort(int larik2[]) {
		for (int i=0;i<larik2.length;i++) {
			int min =i;
			for (int elemen=i+1;elemen<larik2.length;elemen++) {
				if (larik2[min]>larik2[elemen])
				min = elemen;
			}
			tukar(larik2, min,i);
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
		SelectionSort lrk = new SelectionSort();
		int nilai[]= new int[7];
		System.out.println("Masukkan 7 buah data bilangan");
		for (int i = 0; i < 7; i++) {
			System.out.print("Data Bilangan Ke-"+(i+1)+" : ");
			nilai[i]=masuk.nextInt();
		}
		System.out.print("\nData bilangan sebelum diurutkan : ");
		for (int i = 0; i < 7; i++)
		System.out.print(nilai[i]+" ");
		System.out.print("\nData bilangan setelah diurutkan : ");
		lrk.selectionSort(nilai);
		for (int i = 0; i < 7; i++)
		System.out.print(nilai[i]+" ");
		System.out.println("");
	}
}