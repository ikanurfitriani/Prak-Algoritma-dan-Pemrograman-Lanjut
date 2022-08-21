import java.util.Scanner;
public class Latihan7_1
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int i=1;
		while (i<=10)
		{
			if(i%2==0)
				System.out.println("Bilangan Genap adalah "+i);
			else{
				if(i%2!=0)
				System.out.println("Bilangan Ganjil adalah "+i);
			}
			i++;
		}
	}
}