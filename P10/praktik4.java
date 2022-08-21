import java.util.Scanner;
public class praktik4 {
	public static int hitungJumlah(int[] x){
		int jum=0;
		for (int i=0;i<x.length;i++){
			jum += x[i];
		}
		return jum;
	}
	public static void main(String[] args) {
		int data[] = new int[10];
		int jumlah;
		float rata, ndata=10;
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<10;i++){
			System.out.print("Masukkan data ke-"+(i+1)+" : ");
			data[i] = scan.nextInt();
		}
		jumlah = hitungJumlah(data);
		System.out.println("Jumlah data = "+jumlah);
		rata = jumlah/ndata;
		System.out.println("Rata-rata data = "+rata);
	}
}