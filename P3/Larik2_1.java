import java.util.Scanner;
public class Larik2_1 {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		float nilai[] = new float[5];
		float max, min;
		System.out.println("Masukan 5 buah data nilai");
		for (int i=0; i<5; i++)
		{
			System.out.print( (i + 1 )+" : ");
			nilai[i] = masuk.nextFloat();
		}
		System.out.println("Data nilai yang dimasukan");
		for (int i=0; i<5; i++)
		System.out.println(nilai[i]);
		min = nilai[0];
		max = nilai[0];
		for (int i=0; i<5; i++) {
			if(nilai[i] > max) {
				max = nilai[i];
			}
			else if(nilai[i] < min) {
				min = nilai[i];
			}
		}
		System.out.println("Bilangan Maksimum = "+max);
		System.out.println("Bilangan Minimum = "+min);
	}
}