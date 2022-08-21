import java.util.Scanner;
public class Latihan6_2{
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int nilai, i;
		System.out.print("Masukkan angka bulat (0 - 100) : ");
		nilai=in.nextInt();
		if (nilai>=60){
			if (nilai>=80){
				for (i=1; i<=5; i++) {
					System.out.println("Nilaimu bagus sekali ");
				}
			} else {
				for (i=1; i<=5; i++) {
					System.out.println("Nilaimu bagus ");
				}
			}
		}
		else {
			if (nilai>=30){
				for (i=1; i<=5; i++) {
					System.out.println("Nilaimu kurang ");
				}
			} else {
				for (i=1; i<=5; i++) {
					System.out.println("Nilaimu jelek ");
				}
			}
		}
	}
}