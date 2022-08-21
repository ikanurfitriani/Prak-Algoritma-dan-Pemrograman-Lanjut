import java.util.Scanner;
public class Biodata_Mhs1 {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        int i,jumlahMk;
        String nama,nim,jurusan;
        String mataKuliah[]=new String[15];
        String grade[]=new String[15];
        int uts[]=new int[15];
        int uas[]=new int[15];
        double nilai[]=new double[15];
        System.out.println("==================================");
        System.out.println("   Menghitung Nilai Mahasiswa");
        System.out.println("==================================");
        System.out.print("   Masukan Jumlah Mata Kuliah: ");
        jumlahMk=input.nextInt();
        System.out.println("==================================");
        System.out.print("  Nama     : ");
        nama=input.next();
        System.out.print("  NPM      : ");
        nim=input.next();
        System.out.print("  Jurusan  : ");
        jurusan=input.next();
        System.out.println("==================================");
        for(i=1; i<=jumlahMk; i++){
            System.out.print("\n Mata kuliah ke-"+i+" : ");
            mataKuliah[i]=input.next();
            System.out.print(" Nilai UTS  : ");
            uts[i]=input.nextInt();
            System.out.print(" Nilai UAS  : ");
            uas[i]=input.nextInt();
            nilai[i]=((uts[i]*0.7)+(uas[i]*0.3));
            if (nilai[i]>=90) grade[i]="A";
            else if (nilai[i]>=70) grade[i]="B";
            else if (nilai[i]>=60) grade[i]="C";
            else if (nilai[i]>=50) grade[i]="D";
            else grade[i]="E";
		}
        System.out.println("==================================");
        System.out.println(" Nama: "+nama+"\t NPM: "+nim);
        System.out.println("==================================");
        System.out.println(" Mata Kuliah \t Nilai \t Grade");
        System.out.println("==================================");
        for(i=1;i<=jumlahMk;i++){
        	System.out.println(" "+mataKuliah[i]+" \t "+nilai[i]+" \t "+grade[i]);
		}
	}
}
