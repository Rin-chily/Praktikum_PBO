package Pertemuan4.Kasir;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.println("== KASIR ==");

       System.out.print("Masukkan Nama Pembeli: ");
       String nama = scanner.nextLine();
       
       System.out.print("Masukan Nama Produk: ");
       String produk = scanner.nextLine();
       
       System.out.print("Masukkan Harga: ");
       float harga = scanner.nextFloat();
       
       System.out.print("Masukan Jumlah: ");
       Integer Jumlah = scanner.nextInt();

       float Total = harga * Jumlah;
       
       System.out.println("Nama: " + nama);
       System.out.println("Produk: " + produk);
       System.out.println("Harga: " + harga);
       System.out.println("Jumlah: " + Jumlah);
       System.out.println("Total Harga: " + Total);
       
    }
}
