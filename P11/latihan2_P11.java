public class latihan2_P11 {
	public static int god(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return god(y, x%y);
		}
	}
	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor dari 15 dan 35 adalah " + god(15,35));
		System.out.println("Greatest Common Divisor dari 24 dan 56 adalah " + god(24,56));
		System.out.println("Greatest Common Divisor dari 33 dan 77 adalah " + god(33,77));
	}
}