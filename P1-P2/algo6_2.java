public class algo6_2
{
	public static void main(String[] args)
	{
		int i, j, k, l;
		i = 1;
		while (i <= 5) {
			j=4;
			while (j>=i) {
				System.out.print(' ');
				j--;
			}
			k=1;
			while (k <= i) {
				System.out.print(k);
				k++;
			}
			l=1;
			while (l <= i-1) {
				System.out.print(i);
				l++;
			}
			System.out.println();
			i++;
		}
	}
}