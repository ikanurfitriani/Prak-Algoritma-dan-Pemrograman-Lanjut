import java.util.Scanner;
public class tug1_ifelse {
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int pil;
		String merk, model;
		System.out.println("	Melihat Harga mobil/motor	");
		System.out.println("Pilih 1 untuk melihat harga mobil");
		System.out.println("Pilih 2 untuk melihat harga motor");
		System.out.print("Masukkan pilihan Anda : ");
		pil=in.nextInt();
		System.out.print("Masukkan merk mobil/motor : ");
		merk=in.next();
		System.out.print("Masukkan model mobil/motor : ");
		model=in.next();
		System.out.println("---------------------------------------------------");
		if (pil == 1)
		{
			if (merk.equals("Honda")) {
				if (model.equals("Jazz"))
				System.out.println("Harga Mobil Honda "+model+" : Rp. 170.000.000");
				else if (model.equals("Brio"))
				System.out.println("Harga Mobil Honda "+model+" : Rp. 120.000.000");
				else if (model.equals("Mobilio"))
				System.out.println("Harga Mobil Honda "+model+" : Rp. 170.000.000");
				else
				System.out.println("Salah masukkan model mobil");
			} else if (merk.equals("Suzuki")) {
				if (model.equals("APV"))
				System.out.println("Harga Mobil Suzuki "+model+" : Rp. 180.000.000");
				else if (model.equals("Swift"))
				System.out.println("Harga Mobil Suzuki "+model+" : Rp. 155.000.000");
				else if (model.equals("Ertiga"))
				System.out.println("Harga Mobil Suzuki "+model+" : Rp. 160.000.000");
				else
				System.out.println("Salah masukkan model mobil");
			} else {
				System.out.println("Salah masukkan merek mobil");
			}
		} else if (pil == 2) {
			if (merk.equals("Honda")) {
				if (model.equals("Vario"))
				System.out.println("Harga Motor Honda "+model+" : Rp. 15.000.000");
				else if (model.equals("Supra"))
				System.out.println("Harga Motor Honda "+model+" : Rp. 12.000.000");
				else
				System.out.println("Salah masukkan model motor");
			} else if (merk.equals("Yamaha")) {
				if (model.equals("Mio"))
				System.out.println("Harga Motor Yamaha "+model+" : Rp. 14.000.000");
				else if (model.equals("Vixion"))
				System.out.println("Harga Motor Yamaha "+model+" : Rp. 20.000.000");
				else
				System.out.println("Salah masukkan model motor");
			} else {
				System.out.println("Salah masukkan merek motor");
			}
		} else {
			System.out.println("Salah masukkan pilihan");
		}
	}
}
