import java.util.Scanner;
public class tugas1 {
	static boolean kataPalindrome(String kata) {
		int left = 0;
		int right = kata.length()-1;
		while (left < right) {
			if (kata.charAt(left) != kata.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("CEK PALINDROME");
		System.out.println("==============");
		System.out.print("\n Input kata : ");
		String kata2 = input.nextLine();
		if (kataPalindrome(kata2))
			System.out.println(kata2 + " adalah Palindrome");
		else
			System.out.println(kata2 + " BUKAN Palindrome");
	}
}