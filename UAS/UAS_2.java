import java.util.Scanner;
public class UAS_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bil, batas;
        System.out.print("masukkan batas: ");
        batas=input.nextInt();
        for (int i=2; i<=batas; i++){
            bil=0;
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==1){
                System.out.println(i);
            }
        }
	}
}