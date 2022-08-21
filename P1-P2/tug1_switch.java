import java.util.Scanner;
public class tug1_switch {
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
		switch(pil)
		{
			case 1:
			switch(merk)
			{
				case "Honda":
				switch(model)
				{
					case "Jazz":
						System.out.println("Harga Mobil Honda "+model+" : Rp. 170.000.000");
						break;
					case "Brio":
						System.out.println("Harga Mobil Honda "+model+" : Rp. 120.000.000");
						break;
					case "Mobilio":
						System.out.println("Harga Mobil Honda "+model+" : Rp. 170.000.000");
						break;
					default:
						System.out.println("Salah masukkan model mobil");
				}
				break;
				case "Suzuki":
				switch(model)
				{
					case "APV":
						System.out.println("Harga Mobil Suzuki "+model+" : Rp. 180.000.000");
						break;
					case "Swift":
						System.out.println("Harga Mobil Suzuki "+model+" : Rp. 155.000.000");
						break;
					case "Ertiga":
						System.out.println("Harga Mobil Suzuki "+model+" : Rp. 160.000.000");
						break;
					default:
						System.out.println("Salah masukkan model mobil");
				}
				break;
				default:
					System.out.println("Salah masukkan merek mobil");
			}
			break;
			case 2:
			switch(merk)
			{
				case "Honda":
				switch(model)
				{
					case "Vario":
						System.out.println("Harga Motor Honda "+model+" : Rp. 15.000.000");
						break;
					case "Supra":
						System.out.println("Harga Motor Honda "+model+" : Rp. 12.000.000");
						break;
					default:
						System.out.println("Salah masukkan model motor");
				}
				break;
				case "Yamaha":
				switch(model)
				{
					case "Mio":
						System.out.println("Harga Motor Yamaha "+model+" : Rp. 14.000.000");
						break;
					case "Vixion":
						System.out.println("Harga Motor Yamaha "+model+" : Rp. 20.000.000");
						break;
					default:
						System.out.println("Salah masukkan model motor");
				}
				break;
				default:
					System.out.println("Salah masukkan merek motor");
			}
			break;
			default:
				System.out.println("Salah masukkan pilihan");
		}
	}
}
