package com.inheritance.Overriding;

public class main {
    public static void main(String[] args) {
        bangundatar BangunDatar = new bangundatar();
        Lingkaran el = new Lingkaran(7);

        BangunDatar.luas();
        BangunDatar.keliling();

        System.out.println("Luas Lingkaran: " + el.luas());
        System.out.println("Kelliling Lingkaran" + el.keliling());
    }
}
