public class Tugas7_1 {
	public static void main(String[] args) {
		int jmlh_suku=0, total_suku=0, ulang=4;
		for (int suku=1; suku<=ulang; suku++){
			jmlh_suku++;
			total_suku += suku;
			System.out.print("("+suku+")");
			if (jmlh_suku==2){
				System.out.print(total_suku);
				jmlh_suku=0;
				total_suku=0;
			}
		}
		System.out.println();
	}
}