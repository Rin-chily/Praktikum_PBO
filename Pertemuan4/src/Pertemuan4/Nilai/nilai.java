package Pertemuan4.Nilai;

import java.util.Scanner;

public class nilai {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.println("== Program nilai ==");

       System.out.print("Masukkan Jumlah Mahasiswa: ");
       int Jumlah = scanner.nextInt();

       double[] nilai = new double[Jumlah];

       for (int i = 0; i < Jumlah; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai[i] = scanner.nextInt();
       }

       //total nilai
       double totalNilai = 0;
       for (int i = 0; i < Jumlah; i++){
        totalNilai+=nilai[i];
       }
       double average = totalNilai / Jumlah;

       System.out.println("== Nilai Mahasiswa ==");
       for (int i = 0; i < Jumlah; i++){
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
       }
       System.out.println("Rata-Rata: " + average);


    }
}
