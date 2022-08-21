public class algo6_3
{
	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 1;
		do {
			c=1;
			do {
				System.out.print('*');
				c++;
			}
			while (c <= b);
			System.out.println();
			b++;
		}
		while (b <= a);
	}
}