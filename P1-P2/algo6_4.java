public class algo6_4
{
	public static void main(String[] args)
	{
		int x, i, j, k, l;
		x = 5;
		i = 0;
		do {
			j=6;
			k=1;
			l=1;
			i++;
			do {
				System.out.print(" ");
				j--;
			}
			while (j >= i);
			do {
				System.out.print("*");
				k++;
			}
			while (k <= i);
			do {
				if (l <= i - 1){
					System.out.print("*");
				}
				l++;
			}
			while (l <= i - 1);
			System.out.println();
		}
		while (i <= x);
	}
}