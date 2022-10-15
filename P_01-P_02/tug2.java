import java.util.Scanner;
public class tug2 {
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int kode_bln, thn;
		System.out.println("	Menampilkan Bulan & Jumlah Hari	");
		System.out.print("Masukkan kode bulan (1-12) : ");
		kode_bln=in.nextInt();
		System.out.println("---------------------------------------------");
		switch(kode_bln)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Jumlah hari = 31");
				break;
			case 2:
				System.out.print("Tahun : ");
				thn=in.nextInt();
				if(thn%4==0)
				System.out.println("Jumlah hari = 29");
				else
				System.out.println("Jumlah hari = 28");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("Jumlah hari = 30");
				break;
			default:
				System.out.println("Salah masukkan kode bulan");
		}
	}
}
